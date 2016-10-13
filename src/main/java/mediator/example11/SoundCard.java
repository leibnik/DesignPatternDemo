package mediator.example11;

/**
 * Created by leibnik on 16-10-13.
 */
public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundPlay(String data) {
        System.out.println("音频：" + data);
    }
}
