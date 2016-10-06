package abstract_factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public abstract class CarFactory {

    public abstract ITire createTire();

    public abstract IEngine createEngine();

    public abstract IBrake createBrake();
}
