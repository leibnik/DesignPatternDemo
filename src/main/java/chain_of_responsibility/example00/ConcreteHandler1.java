package chain_of_responsibility.example00;

/**
 * Created by leibnik on 16-10-8.
 */
public class ConcreteHandler1 extends Handler{
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler1")){
            System.out.println("ConcreteHandler1 handled");
        }else{
            successor.handleRequest(condition);
        }
    }
}
