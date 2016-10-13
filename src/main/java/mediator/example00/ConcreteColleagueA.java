package mediator.example00;

/**
 * Created by leibnik on 16-10-13.
 */
public class ConcreteColleagueA extends Colleague{

    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("ColleagueA将信息递交给中介者处理");
    }
}
