package AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
    PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPalGateway());
    paypalProcessor.processPayment(250.00);

    PaymentProcessor stripeProcessor = new StripeAdapter(new StripeGateway());
    stripeProcessor.processPayment(499.99);
    }
}

