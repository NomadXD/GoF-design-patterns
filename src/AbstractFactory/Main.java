package AbstractFactory;

public class Main {

    private static Application application;
    private static GUIFactory factory;


    public static void main(String[] args) {
        String OSname = "Windows";
        if(OSname=="Windows"){
            factory = new WindowsFactory();
            application = new Application(factory);

        }else if(OSname=="Linux"){
            factory = new LinuxFactory();
            application = new Application(factory);

        }else if(OSname=="MacOS"){
            factory = new MacOSFactory();
            application = new Application(factory);
        }

        application.paint();

    }

    /*

    The main difference between the factory method and abstract factory occurs here.

    Here in the abstract factory, the product is not instantiated by calling the sub classes. Instead without using inheritance, we use composition here. A relevant factory object is instantiated
    and passed in to the product class constructor. Then using the methods in the factory object passed,relevant values are assigned and the relevant product is made.

    If we were to use Factory method, we would have directly instantiated the relevant product by calling relevant sub classes. e.g.- application =  new WindowsApplication()


     */




}
