package org.yang.define.handler;

import com.networknt.handler.LightHttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class OauthAccessTokensGetHandler implements LightHttpHandler {
    /**
     * @param grantTypeString   @Required 
     *           token grant type; 'client_credentials' or 'request_token'

     * @param grantRequestString   @Required 
     *           for 'client_credentials' use the secret key generated during the partner registration; for 'request_token' use the JWT request token built according to the Public API Integration Guide
     */
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
        exchange.setStatusCode(-1);
        exchange.getResponseSender().send("[{\"code\":9999,\"message\":\"Unknown application error\"}]");
    }
}
