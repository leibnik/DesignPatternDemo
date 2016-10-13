package mediator.example00;

/**
 * Created by leibnik on 16-10-13.
 */
public class ConcreteMediator extends Mediator{

    @Override
    public void action() {
        colleagueA.action();
        colleagueB.action();
    }
}
