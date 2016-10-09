package chain_of_responsibility.example00;

/**
 * Created by leibnik on 16-10-8.
 */
public class ConcreteHandler2 extends Handler{
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler2")){
            System.out.println("ConcreteHandler2 handled");
        }else{
            successor.handleRequest(condition);
        }
    }
}
