package proxy.example00;

/**
 * Created by leibnik on 16-10-14.
 */
public class RealSubject extends Subject {
    @Override
    public void visit() {
        System.out.println("Real subject");
    }
}
