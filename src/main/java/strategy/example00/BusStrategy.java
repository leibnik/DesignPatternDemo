package strategy.example00;

/**
 * Created by leibnik on 16-10-7.
 */
public class BusStrategy implements CalculateStrategy{
    @Override
    public int calculatePrice(int km) {
        // 超过10公里的总距离
        int extraTotal = km - 10;
        // 超过的距离是5公里的倍数
        int extraFactor = extraTotal / 5;
        // 超过的距离对5公里取余
        int fraction = extraTotal % 5;
        // 价格计算
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
