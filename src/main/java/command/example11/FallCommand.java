package command.example11;

/**
 * Created by leibnik on 16-10-10.
 */
public class FallCommand implements Command {
    private TetrisMachine machine;

    public FallCommand(TetrisMachine machine){
        this.machine = machine;
    }
    @Override
    public void excute() {
        machine.fastToBottom();
    }
}
