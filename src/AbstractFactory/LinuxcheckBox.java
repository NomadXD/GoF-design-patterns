package AbstractFactory;

public class LinuxcheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Linux Check Box created");
    }
}
