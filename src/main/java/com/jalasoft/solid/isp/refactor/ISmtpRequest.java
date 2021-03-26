package com.jalasoft.solid.isp.refactor;

/**
 * Defines SMTP request base abstraction.
 */
public interface ISmtpRequest {

    /**
     * Sends request using SMTP.
     */
    void sendBySmtp();
}
