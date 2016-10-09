package command.example11;

/**
 * Created by leibnik on 16-10-10.
 */
public class Test {

    public static void main(String[] args) {
        TetrisMachine machine = new TetrisMachine();

        FallCommand fallCommand = new FallCommand(machine);
        LeftCommand leftCommand = new LeftCommand(machine);
        RightCommand rightCommand = new RightCommand(machine);
        TransformCommand transformCommand = new TransformCommand(machine);

        Button button = new Button();
        button.setFallCommand(fallCommand);
        button.setLeftCommand(leftCommand);
        button.setRightCommand(rightCommand);
        button.setTransformCommand(transformCommand);

        button.toRight();
        button.transform();
        button.toLeft();
        button.toLeft();
        button.fastToBottom();
    }
}
