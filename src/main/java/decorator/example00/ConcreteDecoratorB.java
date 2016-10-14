package decorator.example00;

/**
 * Created by leibnik on 16-10-15.
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        super.operate();
        operateB1();
        operateB2();
    }

    private void operateB1(){
        System.out.println("增加的方法-operateB1");
    }

    private void operateB2(){
        System.out.println("增加的方法-operateB2");
    }

}
