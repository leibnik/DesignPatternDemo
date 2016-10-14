package adapter.example11;

/**
 * Created by leibnik on 16-10-15.
 */
public class VoltAdapter implements Volt5{

    private Volt220 mVolt220;

    public VoltAdapter(Volt220 volt220){
        this.mVolt220 = volt220;
    }

    @Override
    public int getVolt5() {
        return 5;
    }
    public int getVolt220(){
        return mVolt220.getVolt220();
    }
}
