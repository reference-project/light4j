package org.yang.define.handler;

import com.networknt.handler.LightHttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class MoneyRequestsSendGetHandler implements LightHttpHandler {
    /**
     * @param fromDateString   @Optional 
     *           UTC datatime format is yyyy-MM-dd'T'HH:mm:ss.SSS'Z', e.g. '2016-09-11T16:12:12.000'; this parameter is mandatory if sourceMoneyRequestId or referenceNumber is not given.
     * @param toDateString   @Optional 
     *           UTC datatime format is yyyy-MM-dd'T'HH:mm:ss.SSS'Z', e.g. '2016-09-11T16:12:12.000'; this parameter is mandatory if sourceMoneyRequestId or referenceNumber is not given.
     * @param maxResponseItemsInteger   @Optional 
     *           if offset is provided then maxResponse items is required; all ( OR maximum set by interac system ) items are returned if this field is absent
     * @param offsetInteger   @Optional 
     *           offset is starting point of money-requests filter; if offset is not provided it would be defaulted  to zero;
     * @param sortByString   @Optional 
     *           money-requests will be sorted based on sortBy column. 
     * @param orderByString   @Optional 
     *           order by is required if sort by is specified.
     * @param sourceMoneyRequestIdString   @Optional minLength:1;maxLength:64;
     *           id created at originating system
     * @param referenceNumberString   @Optional maxLength:16;
     *           unique money request reference Number  
     */
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
        exchange.setStatusCode(404);
        exchange.getResponseSender().send("[{\"code\":1005,\"message\":\"ApiRegistartionId doesn't exist.\"},{\"code\":1007,\"message\":\"Contact doesn't exist.\"},{\"code\":1025,\"message\":\"Money request doesn't exist.\"},{\"code\":1053,\"message\":\"orderBy field is missing.\"}]");
    }
}
