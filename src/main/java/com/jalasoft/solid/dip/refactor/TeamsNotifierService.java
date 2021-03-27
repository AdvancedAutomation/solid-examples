package com.jalasoft.solid.dip.refactor;

/**
 * Defines a MS Teams notification service.
 */
public class TeamsNotifierService implements INotifierService {

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendMessage(final String to, final String message) {
        // Sends notification message by MS Teams.
    }
}
