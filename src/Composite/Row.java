package Composite;

public class Row extends Composite {

    public Row(int value) {
        super(value);
    }

    @Override
    public void traverse() {
        System.out.println("Row");
        super.traverse();
    }
}
