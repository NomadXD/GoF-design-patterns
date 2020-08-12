package Prototype;

public class Client {
    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype("50");
        ConcretePrototype concretePrototype1 = (ConcretePrototype)concretePrototype.clone();
        System.out.println(concretePrototype.hashCode());
        System.out.println(concretePrototype1);
//        concretePrototype1.setId("100");
//        System.out.println(concretePrototype1.hashCode());
    }
}
