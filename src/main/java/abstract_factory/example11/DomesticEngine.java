package abstract_factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class DomesticEngine implements IEngine{
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}
