package visitor.example00;

/**
 * Created by leibnik on 16-10-12.
 */
public interface Visitor {

    void visit(Manager manager);
    void visit(Engineer engineer);
}
