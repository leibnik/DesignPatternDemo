package proxy.example00;

/**
 * Created by leibnik on 16-10-14.
 */
public class ProxySubject extends Subject{

    private RealSubject mSubject;

    public ProxySubject(RealSubject realSubject){
        this.mSubject = realSubject;
    }
    @Override
    public void visit() {
        mSubject.visit();
    }
}
