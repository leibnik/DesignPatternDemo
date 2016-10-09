package chain_of_responsibility.example11;

/**
 * Created by leibnik on 16-10-8.
 */
public abstract class AbstractRequest {
    private Object obj;

    public AbstractRequest(Object obj){
        this.obj = obj;
    }

    public Object getContent(){
        return obj;
    }

    public abstract int getRequestLevel();
}
