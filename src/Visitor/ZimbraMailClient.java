package Visitor;

public class ZimbraMailClient implements IMailClient {
    @Override
    public void send(String mail) {
        System.out.println("Mail sent by Zimbra Mail Client");
    }

    @Override
    public void receiveMail(String mail) {
        System.out.println("Mail received by Zimbra Mail client");
    }

    @Override
    public void accept(IMailClientVisitor iMailClientVisitor) {
        iMailClientVisitor.visit(this);

    }
}
