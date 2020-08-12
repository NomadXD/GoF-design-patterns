package Builder;

abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createPizza(){
        pizza = new Pizza();
    }

    abstract void buildDough();
    abstract void buildSauce();
    abstract void buildTop();
}
