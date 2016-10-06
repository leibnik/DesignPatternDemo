package abstract_factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class SeniorBrake implements IBrake{
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
