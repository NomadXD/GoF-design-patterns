package Composite;

public class Client {

    public static void main(String[] args) {

        Composite first = new Row(1);
        Composite second = new Column(2);
        Composite third = new Column(3);
        Composite fourth = new Column(4);
        first.add(second);
        first.add(third);
        first.add(fourth);
        first.add(new Primitive(5));
        second.add(new Primitive(6));
        first.traverse();

    }

}
