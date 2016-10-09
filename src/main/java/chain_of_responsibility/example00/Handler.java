package chain_of_responsibility.example00;

/**
 * Created by leibnik on 16-10-8.
 */
public abstract class Handler {
    protected Handler successor;
    public abstract void handleRequest(String condition);
}
