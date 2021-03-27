package com.jalasoft.solid.dip.refactor;

/**
 * Defines a Slack notification service.
 */
public class SlackNotifierService implements INotifierService {

    /**
     * {@inheritDoc}
     */
    @Override
    public void sendMessage(final String to, final String message) {
        // Sends notification message by Slack.
    }
}
