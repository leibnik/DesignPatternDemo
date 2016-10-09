package command.example11;

/**
 * Created by leibnik on 16-10-10.
 */
public class TransformCommand implements Command{

    private TetrisMachine machine;

    public TransformCommand(TetrisMachine machine){
        this.machine = machine;
    }
    @Override
    public void excute() {
        machine.transform();
    }
}
