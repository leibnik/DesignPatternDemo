package factory.example00;

/**
 * Created by leibnik on 16-10-6.
 */
public abstract class ReflectFactory {
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
