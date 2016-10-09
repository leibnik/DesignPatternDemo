package command.example11;

/**
 * Created by leibnik on 16-10-9.
 */
public class LeftCommand implements Command{

    private TetrisMachine machine;

    public LeftCommand(TetrisMachine machine){
        this.machine = machine;
    }
    @Override
    public void excute() {
        machine.toLeft();
    }
}
