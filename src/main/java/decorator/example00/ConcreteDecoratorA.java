package decorator.example00;

/**
 * Created by leibnik on 16-10-15.
 */
public class ConcreteDecoratorA extends Decorator{
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();
        operateA1();
        operateA2();
    }

    private void operateA1(){
        System.out.println("增加的方法-operateA1");
    }
    private void operateA2(){
        System.out.println("增加的方法-operateA2");
    }

}
