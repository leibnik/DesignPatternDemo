package abstract_factory.example00;

/**
 * Created by leibnik on 16-10-6.
 */
public class ConcreteFactory2 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
