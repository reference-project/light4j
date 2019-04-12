package org.yang.define.handler;

import com.networknt.handler.LightHttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class ContactsGetHandler implements LightHttpHandler {
    /**
     * @param maxResponseItemsInteger   @Optional 
     * @param fromLastUpdatedDateString   @Optional 
     *           UTC datatime of contact used to retrieve only contacts updated from the specified dateTime; format is yyyy-MM-dd'T'HH:mm:ss.SSS'Z', e.g. '2016-09-11T16:12:12.000'
     * @param offsetInteger   @Optional 
     *           offset is starting point of contacts filter; if offset is not provided it would be defaulted to zero;
     * @param sortByString   @Optional 
     *           contacts will be sorted based on sortBy column, 
 - sortBy will be set to contactUpdatedDate if fromLastUpdatedDate.
 - sortBy will be defaulted to contactName if no filters are specified.
     * @param orderByString   @Optional 
     *           order by is required if sort by is specified.
     */
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
        exchange.setStatusCode(404);
        exchange.getResponseSender().send("[{\"code\":1005,\"message\":\"ApiRegistartionId doesn't exist.\"}]");
    }
}
