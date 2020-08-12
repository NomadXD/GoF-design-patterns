package Builder;

public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        SpicyPizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();
        Pizza pizzaHawaiian = waiter.getPizza();
        System.out.println(pizzaHawaiian);
        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();
        Pizza pizzaSpicy = waiter.getPizza();
        System.out.println(pizzaSpicy);
    }
}



/*

Here there is a drawback of the design pattern. That means the client should know about the relevant pizza builder. So to reduce coupling the mapping of pizza requests with pizza builders should be
implemented inside the waiter class.

 */
