package Visitor;

public class OperaMailClient implements IMailClient {
    @Override
    public void send(String mail) {
        System.out.println("Mail sent by Opera Mail Client");
    }

    @Override
    public void receiveMail(String mail) {
        System.out.println("Mail received by Opera Mail Receiver");
    }

    @Override
    public void accept(IMailClientVisitor iMailClientVisitor) {
        iMailClientVisitor.visit(this);
    }
}
