public class TestDecoratorPattern {
    public static void main(String[] args) {
        // Base Notifier: Email only
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS
        Notifier smsEmailNotifier = new SMSNotifierDecorator(emailNotifier);

        // Add Slack on top of Email and SMS
        Notifier fullNotifier = new SlackNotifierDecorator(smsEmailNotifier);

        // Send notification via all channels
        fullNotifier.send("System alert: Server is down!");
    }
}
