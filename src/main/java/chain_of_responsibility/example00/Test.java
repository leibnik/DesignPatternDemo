package chain_of_responsibility.example00;

/**
 * Created by leibnik on 16-10-8.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();

        handler1.successor = handler2;
        handler2.successor = handler1;

        handler1.handleRequest("ConcreteHandler2");
    }
}
