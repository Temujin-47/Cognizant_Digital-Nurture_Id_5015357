public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Basic Email notification
        Notifier notifier = new EmailNotifier();
        notifier.send("Hello, this is an email notification!");

        System.out.println();

        // Email and SMS notification
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Hello, this is a combined email and SMS notification!");

        System.out.println();

        // Email, SMS, and Slack notification
        Notifier slackNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        slackNotifier.send("Hello, this is a combined email, SMS, and Slack notification!");
    }
}
