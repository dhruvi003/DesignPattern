package Excercise1.Structural.paymentSystem;

public class Client {
    public static void main(String[] args) {
        // PayPal payment
        Paypal payPal = new Paypal();
        PaymentGateway payPalAdapter = new PayPalAdapter(payPal);
        payPalAdapter.processPayment("100");

        // Stripe payment
        Stripe stripe = new Stripe();
        PaymentGateway stripeAdapter = new StripeAdapter(stripe);
        stripeAdapter.processPayment("200");
    }
}
