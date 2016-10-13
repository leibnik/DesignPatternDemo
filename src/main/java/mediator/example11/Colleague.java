package mediator.example11;

/**
 * Created by leibnik on 16-10-13.
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
