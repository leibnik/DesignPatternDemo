package command.example11;

/**
 * Created by leibnik on 16-10-10.
 */
public class Button {
    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private TransformCommand transformCommand;
    private FallCommand fallCommand;

    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    public void setTransformCommand(TransformCommand transformCommand) {
        this.transformCommand = transformCommand;
    }

    public void toLeft() {
        leftCommand.excute();
    }

    public void toRight() {
        rightCommand.excute();
    }

    public void fastToBottom() {
        fallCommand.excute();
    }

    public void transform() {
        transformCommand.excute();
    }
}
