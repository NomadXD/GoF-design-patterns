package Visitor;

public class MacMailClientVisitor  implements IMailClientVisitor{
    @Override
    public void visit(OperaMailClient operaMailClient) {
        System.out.println("Opera Mail Client configured for Mac");

    }

    @Override
    public void visit(SquirrelMailClient squirrelMailClient) {
        System.out.println("Squirrel Mail Client configured for Mac");

    }

    @Override
    public void visit(ZimbraMailClient zimbraMailClient) {
        System.out.println("Zimbra Mail Client configured for Mac");

    }
}
