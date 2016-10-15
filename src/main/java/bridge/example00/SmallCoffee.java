package bridge.example00;

/**
 * Created by leibnik on 16-10-15.
 */
public class SmallCoffee extends Coffee{

    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的" + impl.addSomething() + "咖啡");
    }
}
