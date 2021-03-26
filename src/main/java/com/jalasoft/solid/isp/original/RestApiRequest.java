package com.jalasoft.solid.isp.original;

import java.util.Map;

/**
 * Defines a basic REST API request.
 */
public class RestApiRequest implements IRequest {

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

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendBySmtp() {
        throw new UnsupportedOperationException("REST API requests cannot be send by SMTP.");
    }
}
