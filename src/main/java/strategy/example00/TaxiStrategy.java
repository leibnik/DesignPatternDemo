package strategy.example00;

/**
 * Created by leibnik on 16-10-7.
 */
public class TaxiStrategy implements CalculateStrategy{
    @Override
    public int calculatePrice(int km) {
        return 2 * km;
    }
}
