package org.yang.define.handler.database.world;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.config.Config;
import com.networknt.service.SingletonServiceFactory;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;
import lombok.extern.slf4j.Slf4j;
import org.yang.define.handler.database.SqlHelper;
import org.yang.define.model.database.RandomNumber;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/**
 * org.yang.define.handler.database.world.WorldQueryGetHandler
 *
 * @author eleven
 * @date 2019/04/12
 */
@Slf4j
public class WorldQueryGetHandler implements HttpHandler {
    private static final DataSource DATA_SOURCE = SingletonServiceFactory.getBean(DataSource.class);
    private static final ObjectMapper MAPPER = Config.getInstance().getMapper();

    @Override
    public void handleRequest(HttpServerExchange httpServerExchange) throws Exception {
        if (httpServerExchange.isInIoThread()) {
            httpServerExchange.dispatch(this);
            return;
        }
        int queries = 1;

        RandomNumber[] randomNumbers = new RandomNumber[queries];
        try (final Connection connection = DATA_SOURCE.getConnection()) {
            Map<Integer, Future<RandomNumber>> futureWorlds = new ConcurrentHashMap<>(queries);
            for (int i = 0; i < queries; i++) {
                futureWorlds.put(i, SqlHelper.EXECUTOR.submit(() -> {
                    try (PreparedStatement statement = connection.prepareStatement(
                            "SELECT * FROM world WHERE id = ?",
                            ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)) {

                        statement.setInt(1, SqlHelper.randomWorld());
                        ResultSet resultSet = statement.executeQuery();
                        resultSet.next();
                        if (log.isDebugEnabled()) {
                            log.debug("result from execute is {}", resultSet);
                        }
                        return new RandomNumber(resultSet.getInt("id"), resultSet.getInt("randomNumber"));
                    }
                }));
            }

            for (int i = 0; i < queries; i++) {
                randomNumbers[i] = futureWorlds.get(i).get();
            }
        }

        if (log.isDebugEnabled()) {
            log.debug("the object info from database is {}", randomNumbers);
        }

        httpServerExchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "application/json");
        httpServerExchange.getResponseSender().send(MAPPER.writeValueAsString(randomNumbers[0]));
    }
}
