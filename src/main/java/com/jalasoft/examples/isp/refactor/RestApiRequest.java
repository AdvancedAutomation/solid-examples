package com.jalasoft.examples.isp.refactor;

import java.util.Map;

/**
 * Defines a basic REST API request.
 */
public class RestApiRequest implements IHttpsRequest {

    private final Map<String, String> headers;
    private final Map<String, String> params;
    private final String body;

    /**
     * Initializes an instance for RestApiRequest class.
     *
     * @param headers request headers.
     * @param params  request parameters.
     * @param body    request body.
     */
    public RestApiRequest(final Map<String, String> headers, final Map<String, String> params, final String body) {
        this.headers = headers;
        this.params = params;
        this.body = body;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendByHttps() {
        // Send request by HTTP.
    }
}
