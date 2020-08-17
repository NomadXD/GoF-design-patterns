package Strategy;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Item> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    public void addItem(Item item){
        shoppingCart.add(item);
    }

    public void pay(PaymentStratagey paymentStratagey){
        for(int i =0;i<shoppingCart.size();i++){
            paymentStratagey.pay(shoppingCart.indexOf(i));
            //System.out.println(shoppingCart.toString());
        }
    }

}
