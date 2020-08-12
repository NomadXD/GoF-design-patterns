package AbstractFactory;

public class MacOSCheckbox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("MacOS check box created");
    }
}
