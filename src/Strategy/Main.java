package Strategy;

public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("soap",20);
        Item item2 = new Item("pizza",500);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PaypalStrategy());

        shoppingCart.pay(new CreditCardStrategy());
    }

}
