package com.jalasoft.solid.dip.refactor;

/**
 * Defines notifier base abstraction.
 */
public interface INotifierService {

    /**
     * Sends a message using notifier message.
     *
     * @param to      notification receiver.
     * @param message notification message.
     */
    void sendMessage(String to, String message);
}
