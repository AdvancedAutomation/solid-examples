package com.jalasoft.solid.dip.refactor;

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
        INotifierService notifierService = new EmailNotifierService();
        Notifier notifier = new Notifier(notifierService);
        notifier.sendNotificationMessage("carledriss@gmail.com", "hello world");

//        INotifierService notifierService = new SlackNotifierService();
//        Notifier notifier = new Notifier(notifierService);
//        notifier.sendNotificationMessage("carledriss@gmail.com", "hello world");

//        INotifierService notifierService = new TeamsNotifierService();
//        Notifier notifier = new Notifier(notifierService);
//        notifier.sendNotificationMessage("carledriss@gmail.com", "hello world");
    }
}
