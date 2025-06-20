package AdapterPatternExample;

public class PayPalGateway {
    public void makePayment(double amountInDollars) {
        System.out.println("PayPal processing: Rs." + amountInDollars);
    }
}