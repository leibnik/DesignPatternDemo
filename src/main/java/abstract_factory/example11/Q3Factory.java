package abstract_factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class Q3Factory extends CarFactory{
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
