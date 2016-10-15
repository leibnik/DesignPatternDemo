package bridge.example00;

/**
 * Created by leibnik on 16-10-15.
 */
public class Test {
    public static void main(String[] args) {
        Ordinary implOrdinary = new Ordinary();
        Sugar implSugar = new Sugar();

        LargeCoffee largeCoffeeOrdinary = new LargeCoffee(implOrdinary);
        largeCoffeeOrdinary.makeCoffee();

        LargeCoffee largeCoffeeSugar = new LargeCoffee(implSugar);
        largeCoffeeSugar.makeCoffee();

        SmallCoffee smallCoffeeOrdinary = new SmallCoffee(implOrdinary);
        smallCoffeeOrdinary.makeCoffee();

        SmallCoffee smallCoffeeSugar = new SmallCoffee(implSugar);
        smallCoffeeSugar.makeCoffee();
        /*
        resutl:
         大杯的原味咖啡
         大杯的加糖咖啡
         小杯的原味咖啡
         小杯的加糖咖啡
         */
    }
}
