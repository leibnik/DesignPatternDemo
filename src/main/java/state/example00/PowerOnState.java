package state.example00;

/**
 * Created by leibnik on 16-10-7.
 */
public class PowerOnState implements TVState{
    @Override
    public void nextChannel() {
        System.out.println("下一个频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一个频道");
    }

    @Override
    public void turnUp() {
        System.out.println("开机啦");
    }

    @Override
    public void turnDown() {
        System.out.println("关机啦");
    }
}
