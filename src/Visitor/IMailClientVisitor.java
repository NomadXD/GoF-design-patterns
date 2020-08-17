package Visitor;

public interface IMailClientVisitor {

    void visit(OperaMailClient operaMailClient);
    void visit(SquirrelMailClient squirrelMailClient);
    void visit(ZimbraMailClient zimbraMailClient);
}
