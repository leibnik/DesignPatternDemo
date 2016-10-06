package abstract_factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class NormalTire implements ITire{
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
