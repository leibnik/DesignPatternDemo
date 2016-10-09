package chain_of_responsibility.example11;

/**
 * Created by leibnik on 16-10-8.
 */
public class Test {
    public static void main(String[] args) {
        AbstractHandler handler1 = new Handler1();
        AbstractHandler handler2 = new Handler2();
        AbstractHandler handler3 = new Handler3();

        handler1.nextHandler = handler2;
        handler2.nextHandler = handler3;

        AbstractRequest request1 = new Request1("Request1");
        AbstractRequest request2 = new Request2("Request2");
        AbstractRequest request3 = new Request3("Request3");

        handler1.handle(request1);
        handler1.handle(request2);
        handler1.handle(request3);

        /*
            result:
                Handler1 handle request:1
                Handler1 handle request:2
                Handler1 handle request:3
         */
    }
}
