package DecoratorPatternExample;

public class Main {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();

        // Add SMS notification
        Notifier smsNotifier = new SMSNotifierDecorator(baseNotifier);

        // Add Slack notification on top of Email and SMS
        Notifier fullNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send one message through all channels
        fullNotifier.send("Server is down!");
    }
}