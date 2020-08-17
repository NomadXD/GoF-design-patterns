package Strategy;

public class PaypalStrategy implements PaymentStratagey {

    @Override
    public void pay(int amount) {
        System.out.println("Paid by Paypal");
    }
}
