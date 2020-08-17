package Composite;

import java.util.ArrayList;

public abstract class Composite implements Component {

    private ArrayList<Component> parts = new ArrayList<Component>();
    private int value;
    private int total = 0;

    public Composite(int value) {
        this.value = value;
    }

    public void add(Component component){
        total++;
        parts.add(component);
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void traverse() {
        for(int i=0;i<total;i++){
            System.out.println(value+" ");
            parts.get(i).traverse();
        }
    }
}
