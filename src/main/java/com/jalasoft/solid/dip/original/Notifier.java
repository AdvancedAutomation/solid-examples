package com.jalasoft.solid.dip.original;

/**
 * Defines a notifier to send messages using a service.
 */
public class Notifier {

    private final EmailNotifierService notifierService;
    private final SlackNotifierService slackNotifierService;

    /**
     * Initializes an instance of notifier class.
     *
     * @param notifierService email notifier service instance.
     * @param slackNotifierService Slack notifier service instance.
     */
    public Notifier(final EmailNotifierService notifierService, final SlackNotifierService slackNotifierService) {
        this.notifierService = notifierService;
        this.slackNotifierService = slackNotifierService;
    }

    /**
     * Sends notification message.
     *
     * @param to      notification receiver.
     * @param message notification message.
     */
    public void sendNotificationMessage(final String to, final String message) {
        notifierService.sendMessage(to, message);
    }

    public void sendNotificationMessageBySlack(final String to, final String message) {
        slackNotifierService.sendMessage(to, message);
    }
}
