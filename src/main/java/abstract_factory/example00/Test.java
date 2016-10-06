package abstract_factory.example00;

/**
 * Created by leibnik on 16-10-6.
 */
public class Test {
    public static void main(String[] args) {

        AbstractFactory factory1 = new ConcreteFactory1();

        AbstractProductA productA1 = factory1.createProductA();
        productA1.method();
        AbstractProductB productB1 = factory1.createProductB();
        productB1.method();


        AbstractFactory factory2 = new ConcreteFactory2();

        AbstractProductA productA2 = factory2.createProductA();
        productA2.method();
        AbstractProductB productB2 = factory2.createProductB();
        productB2.method();
    }
}
