package chain_of_responsibility.example11;

/**
 * Created by leibnik on 16-10-8.
 */
public class Handler1 extends AbstractHandler{

    @Override
    protected int getHandlerLevel() {
        return 1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("Handler1 handle request:" + request.getRequestLevel());
    }
}
