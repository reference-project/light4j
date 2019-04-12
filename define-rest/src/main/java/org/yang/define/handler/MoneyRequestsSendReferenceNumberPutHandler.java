package org.yang.define.handler;

import com.networknt.handler.LightHttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class MoneyRequestsSendReferenceNumberPutHandler implements LightHttpHandler {
    /**
     * @param referenceNumberString   @Required maxLength:16;
     */
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
        exchange.setStatusCode(404);
        exchange.getResponseSender().send("[{\"code\":1005,\"message\":\"ApiRegistartionId doesn't exist.\"},{\"code\":1006,\"message\":\"Hard contact doesn't exist.\"},{\"code\":1007,\"message\":\"contact doesn't exist.\"},{\"code\":1025,\"message\":\"Money request doesn't exist.\"}]");
    }
}
