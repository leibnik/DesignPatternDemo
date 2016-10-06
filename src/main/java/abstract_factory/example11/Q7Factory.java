package abstract_factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class Q7Factory extends CarFactory{
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
