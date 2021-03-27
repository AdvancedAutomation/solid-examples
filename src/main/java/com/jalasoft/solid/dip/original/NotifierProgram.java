package com.jalasoft.solid.dip.original;

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
        SlackNotifierService slackNotifierService = new SlackNotifierService();

        Notifier notifier = new Notifier(emailNotifierService, slackNotifierService);

        notifier.sendNotificationMessage("carledriss@gmail.com", "hello world!");
        notifier.sendNotificationMessageBySlack("carledriss@gmail.com", "hello world!");

        // Now it is required to support Slack and MS Teams notifications.
    }
}
