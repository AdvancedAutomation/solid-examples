package com.jalasoft.solid.dip.refactor;

/**
 * Defines a notifier to send messages using a service.
 */
public class Notifier {

    private final INotifierService notifierService;

    /**
     * Initializes an instance of notifier class.
     *
     * @param notifierService notifier service instance.
     */
    public Notifier(final INotifierService notifierService) {
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
