package AbstractFactory;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows button created");
    }
}
