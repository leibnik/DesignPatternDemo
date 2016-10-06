package abstract_factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class SUVTire implements ITire{
    @Override
    public void tire() {
        System.out.println("越野轮胎");
    }
}
