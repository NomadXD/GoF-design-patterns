package Visitor;

public class LinuxMailClientVisitor implements IMailClientVisitor {
    @Override
    public void visit(OperaMailClient operaMailClient) {
        System.out.println("Opera Mail Client configured for Linux");

    }

    @Override
    public void visit(SquirrelMailClient squirrelMailClient) {
        System.out.println("Squirrel Mail Client configured for Linux");

    }

    @Override
    public void visit(ZimbraMailClient zimbraMailClient) {
        System.out.println("Zimbra Mail Client configured for Linux");


    }
}
