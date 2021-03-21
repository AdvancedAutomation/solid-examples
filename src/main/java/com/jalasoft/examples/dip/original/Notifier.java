package com.jalasoft.examples.dip.original;

/**
 * Defines a notifier to send messages using a service.
 */
public class Notifier {

    private final EmailNotifierService notifierService;

    /**
     * Initializes an instance of notifier class.
     *
     * @param notifierService email notifier service instance.
     */
    public Notifier(final EmailNotifierService notifierService) {
        this.notifierService = notifierService;
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
}
