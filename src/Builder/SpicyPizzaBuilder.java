package Builder;

public class SpicyPizzaBuilder extends PizzaBuilder {
    @Override
    void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    void buildSauce() {
        pizza.setSauce("hot");
    }

    @Override
    void buildTop() {
        pizza.setTop("pepperoni+salami");

    }
}
