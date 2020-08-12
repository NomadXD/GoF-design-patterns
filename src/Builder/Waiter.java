package Builder;

public class Waiter {

    private PizzaBuilder builder;

    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.builder = pizzaBuilder;

    }

    public void constructPizza(){
        builder.createPizza();
        builder.buildDough();
        builder.buildSauce();
        builder.buildTop();
    }

    public Pizza getPizza(){
        return builder.getPizza();
    }


}
