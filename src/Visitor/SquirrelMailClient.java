package Visitor;

public class SquirrelMailClient implements IMailClient {
    @Override
    public void send(String mail) {
        System.out.println("Mail sent by Squirrel mail client");
    }

    @Override
    public void receiveMail(String mail) {
        System.out.println("Mail received by Squirrel mail client");
    }

    @Override
    public void accept(IMailClientVisitor iMailClientVisitor) {
        iMailClientVisitor.visit(this);

    }
}
