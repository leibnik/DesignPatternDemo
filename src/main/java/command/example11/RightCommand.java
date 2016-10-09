package command.example11;

/**
 * Created by leibnik on 16-10-9.
 */
public class RightCommand implements Command {
    private TetrisMachine machine;

    public RightCommand(TetrisMachine machine){
        this.machine = machine;
    }
    @Override
    public void excute() {
        machine.toRight();
    }
}
