package mediator.example00;

/**
 * Created by leibnik on 16-10-13.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.setColleagueA(new ConcreteColleagueA(mediator));
        mediator.setColleagueB(new ConcreteColleagueB(mediator));
        mediator.action();
    }
}
