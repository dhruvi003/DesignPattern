package Excercise1.Structural.paymentSystem;

public class PayPalAdapter implements PaymentGateway {
    private Paypal payPal;

    public PayPalAdapter(Paypal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(String amount) {
        payPal.sendPayment(amount);
    }
}

