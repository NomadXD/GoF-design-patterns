package Visitor;

public class Client {

    public static void main(String[] args) {

        OperaMailClient operaMailClient = new OperaMailClient();
        SquirrelMailClient squirrelMailClient = new SquirrelMailClient();
        ZimbraMailClient zimbraMailClient  = new ZimbraMailClient();

        WindowsMailClientVisitor windowsMailClientVisitor = new WindowsMailClientVisitor();
        MacMailClientVisitor macMailClientVisitor = new MacMailClientVisitor();
        LinuxMailClientVisitor linuxMailClientVisitor = new LinuxMailClientVisitor();

        operaMailClient.accept(windowsMailClientVisitor);
        operaMailClient.accept(linuxMailClientVisitor);
        operaMailClient.accept(macMailClientVisitor);



    }



}
