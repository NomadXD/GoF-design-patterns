package Composite;

public class Primitive implements Component {

    private int value;

    public Primitive(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void traverse() {
        System.out.println(value+" ");
    }
}
