package decorator.example00;

/**
 * Created by leibnik on 16-10-15.
 * 装饰模式
 * 需要注意与代理模式的区别
 */
public class Test {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Decorator decoratorA = new ConcreteDecoratorA(component);
        Decorator decoratorB = new ConcreteDecoratorB(component);

        decoratorA.operate();
        System.out.println("------------------------");
        decoratorB.operate();

        /*
        result:
         ConcreteComponent
         增加的方法-operateA1
         增加的方法-operateA2
         ------------------------
         ConcreteComponent
         增加的方法-operateB1
         增加的方法-operateB2
         */
    }
}
