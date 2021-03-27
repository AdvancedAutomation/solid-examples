package com.jalasoft.solid.dip.refactor;

/**
 * Defines an email notification service.
 */
public class EmailNotifierService implements INotifierService {

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendMessage(final String to, final String message) {
        // Sends notification message by email.
    }
}
