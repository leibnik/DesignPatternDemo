package factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public abstract class AudiFactory {
    public abstract <T extends AudiCar> T createAudiCar(Class<T> clz);
}
