package chain_of_responsibility.example11;

/**
 * Created by leibnik on 16-10-8.
 */
public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;
    public final void handleRequest(AbstractRequest request){
        if (request.getRequestLevel() == getHandlerLevel()){
            handle(request);
        }else{
            if (nextHandler != null){
                nextHandler.handle(request);
            }else{
                System.out.println("All of handler can not handle the request");
            }
        }
    }
    protected abstract int getHandlerLevel();

    protected abstract void handle(AbstractRequest request);
}
