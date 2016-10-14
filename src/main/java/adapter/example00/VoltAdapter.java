package adapter.example00;

/**
 * Created by leibnik on 16-10-15.
 */
public class VoltAdapter extends Volt220 implements Volt5{

    @Override
    public int getVolt5() {
        return 5;
    }
}
