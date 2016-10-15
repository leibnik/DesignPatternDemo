package bridge.example00;

/**
 * Created by leibnik on 16-10-15.
 */
public abstract class Coffee {

    protected CoffeeAdditives impl;
    public Coffee(CoffeeAdditives impl){
        this.impl = impl;
    }
    public abstract void makeCoffee();
}
