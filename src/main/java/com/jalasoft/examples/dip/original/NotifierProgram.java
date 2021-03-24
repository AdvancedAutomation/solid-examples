package com.jalasoft.examples.dip.original;

public final class NotifierProgram {

    /**
     * Private constructor for example program.
     */
    private NotifierProgram() {
        // Default constructor.
    }

    /**
     * Program entry point.
     *
     * @param args program arguments.
     */
    public static void main(final String[] args) {
        EmailNotifierService emailNotifierService = new EmailNotifierService();
        Notifier notifier = new Notifier(emailNotifierService);
        notifier.sendNotificationMessage("carledriss@gmail.com", "hello world!");

        // Now it is required to support Slack and Teams notifications.
    }
}
