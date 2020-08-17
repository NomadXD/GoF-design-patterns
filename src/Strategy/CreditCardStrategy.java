package Strategy;

public class CreditCardStrategy implements PaymentStratagey {

    @Override
    public void pay(int amount) {
        System.out.println("Paid by CreditCard");
    }
}
