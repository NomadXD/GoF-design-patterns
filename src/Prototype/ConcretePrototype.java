package Prototype;

public class ConcretePrototype implements Prototype  {

    private String id;

    public ConcretePrototype(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }

    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "id='" + id + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }
}
