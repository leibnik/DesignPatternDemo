package command.example00;

/**
 * Created by leibnik on 16-10-9.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
