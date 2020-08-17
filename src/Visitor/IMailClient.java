package Visitor;

public interface IMailClient {

    void send(String mail);
    void receiveMail(String mail);
    void accept(IMailClientVisitor iMailClientVisitor);

}
