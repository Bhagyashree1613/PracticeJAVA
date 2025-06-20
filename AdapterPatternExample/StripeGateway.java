package AdapterPatternExample;

public class StripeGateway {
    public void stripePay(double amountInCents) {
        System.out.println("Stripe processing: Rs." + (amountInCents / 100));
    }
}