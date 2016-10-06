package abstract_factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class NormalBrake implements IBrake{
    @Override
    public void brake() {
        System.out.println("普通制动");
    }
}
