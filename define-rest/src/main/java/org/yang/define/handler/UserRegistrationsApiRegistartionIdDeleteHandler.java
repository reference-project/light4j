package org.yang.define.handler;

import com.networknt.handler.LightHttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class UserRegistrationsApiRegistartionIdDeleteHandler implements LightHttpHandler {
    /**
     * @param apiRegistartionIdString   @Required 
     */
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
        exchange.setStatusCode(404);
        exchange.getResponseSender().send("[{\"code\":1005,\"message\":\"ApiRegistartionId doesn't exist\"}]");
    }
}
