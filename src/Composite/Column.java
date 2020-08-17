package Composite;

public class Column extends Composite {

    private int value;

    public Column(int value) {
        super(value);
    }

    @Override
    public void traverse() {
        System.out.println("Col");
        super.traverse();
    }
}
