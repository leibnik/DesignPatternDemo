package factory.example00;

/**
 * Created by leibnik on 16-10-6.
 */
public class Test {
    public static void main(String[] args) {
        // 需要生产什么产品就用对应的工厂对象
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();
        productA.method();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createProduct();
        productB.method();
        System.out.println("------------------------------------------");

        // 当然使用反射的方法则更加简洁
        ReflectFactory factory = new ReflectConcreteFactory();
        Product product = factory.createProduct(ConcreteProductB.class);
        product.method();

        /*result:

            我是具体产品A
            我是具体产品B
             ------------------------------------------
            我是具体产品B
         */
    }
}
