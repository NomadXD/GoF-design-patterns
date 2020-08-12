package Builder;

public class HawaiianPizzaBuilder extends PizzaBuilder {
    @Override
    void buildDough() {
        pizza.setDough("cross");
    }

    @Override
    void buildSauce() {
        pizza.setSauce("mild");

    }

    @Override
    void buildTop() {
        pizza.setTop("ham+pineapple");
    }
}
