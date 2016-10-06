package factory.example00;

/**
 * Created by leibnik on 16-10-6.
 */
public class ConcreteFactoryA extends Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }


    /*
    当工厂只有一个时可以省略掉工厂抽象类，并将对应的工厂方法
    修改为静态方法
    public static Product createProduct(){
        return new ConcreteProductA();
    }
    */
}
