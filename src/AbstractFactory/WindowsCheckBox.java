package AbstractFactory;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Windows CheckBox created");
    }
}
