package com.jalasoft.solid.isp.original;

import java.util.Map;

/**
 * Defines a basic SOAP API request.
 */
public class SoapApiRequest implements IRequest {

    private final Map<String, String> headers;
    private final String content;

    /**
     * Initializes an instance of SoapApiRequest class.
     *
     * @param headers request headers.
     * @param body    request content.
     */
    public SoapApiRequest(final Map<String, String> headers, final String body) {
        this.headers = headers;
        this.content = body;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendByHttps() {
        // Send Soap message using HTTPS.
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendBySmtp() {
        // Send Soap message using SMTP.
    }
}
