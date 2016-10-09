package chain_of_responsibility.example11;

/**
 * Created by leibnik on 16-10-8.
 */
public class Request1 extends AbstractRequest{

    public Request1(Object obj) {
        super(obj);
    }

    @Override
    public int getRequestLevel() {
        return 1;
    }
}
