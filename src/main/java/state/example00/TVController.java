package state.example00;

/**
 * Created by leibnik on 16-10-7.
 */
public class TVController implements PowerController{

    TVState mTVState;

    public void setTVState(TVState state) {
        this.mTVState = state;
    }

    @Override
    public void powerOn() {
        mTVState = new PowerOnState();
        System.out.println("开机啦");
    }

    @Override
    public void powerOff() {
        mTVState = new PowerOffState();
        System.out.println("关机啦");
    }

    public void nextChannel(){
        mTVState.nextChannel();
    }

    public void prevChannel(){
        mTVState.prevChannel();
    }

    public void turnDown(){
        mTVState.turnDown();
    }

    public void turnUp(){
        mTVState.turnUp();
    }
}
