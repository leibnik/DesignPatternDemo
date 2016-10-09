package command.example00;

/**
 * Created by leibnik on 16-10-9.
 */
public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.action();
    }
}
