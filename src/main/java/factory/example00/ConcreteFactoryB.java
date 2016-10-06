package factory.example00;

/**
 * Created by leibnik on 16-10-6.
 */
public class ConcreteFactoryB extends Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
