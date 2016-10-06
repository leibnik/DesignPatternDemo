package abstract_factory.example00;

/**
 * Created by leibnik on 16-10-6.
 */
public class ConcreteFactory1 extends AbstractFactory{
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
