package mediator.example11;

/**
 * Created by leibnik on 16-10-13.
 */
public class MainBoard extends Mediator{

    private CPU mCpu;
    private CDDevice mCDDevice;
    private SoundCard mSoundCard;
    private GraphicsCard mGraphicsCard;

    public void setCpu(CPU mCpu) {
        this.mCpu = mCpu;
    }

    public void setCDDevice(CDDevice mCDDevice) {
        this.mCDDevice = mCDDevice;
    }

    public void setSoundCard(SoundCard mSoundCard) {
        this.mSoundCard = mSoundCard;
    }

    public void setGraphicsCard(GraphicsCard mGraphicsCard) {
        this.mGraphicsCard = mGraphicsCard;
    }

    @Override
    public void changed(Colleague c) {
        if (c ==mCDDevice){
            handleCD((CDDevice)c);
        }
        else if(c == mCpu){
            handleCPU((CPU) c);
        }
    }

    private void handleCD(CDDevice cd) {
        mCpu.decodeData(cd.read());
    }

    private void handleCPU(CPU c){
        mSoundCard.soundPlay(c.getDataSound());
        mGraphicsCard.videoPlay(c.getDataVideo());
    }
}
