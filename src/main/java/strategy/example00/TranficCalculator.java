package strategy.example00;

/**
 * Created by leibnik on 16-10-7.
 * android动画中的时间插值器
 */
public class TranficCalculator {

    CalculateStrategy strategy;

    public void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculatePrice(int km) {
        return strategy.calculatePrice(km);
    }

    public static void main(String[] args) {
        TranficCalculator calculator = new TranficCalculator();
        calculator.setStrategy(new SubwayStrategy());
        System.out.println("乘坐地铁16公里价格(元)：" + calculator.calculatePrice(16));

        calculator.setStrategy(new TaxiStrategy());
        System.out.println("乘坐出租车20公里价格(元)：" + calculator.calculatePrice(20));

        calculator.setStrategy(new BusStrategy());
        System.out.println("乘坐公交14公里价格(元)：" + calculator.calculatePrice(14));

        /*
        result:
            乘坐地铁16公里价格(元)：5
            乘坐出租车20公里价格(元)：40
            乘坐公交14公里价格(元)：2
         */
    }
}
