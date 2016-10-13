package mediator.example00;

/**
 * Created by leibnik on 16-10-13.
 */
public abstract class Mediator {
    protected ConcreteColleagueA colleagueA;
    protected ConcreteColleagueB colleagueB;
    public void setColleagueA(ConcreteColleagueA colleagueA){
        this.colleagueA = colleagueA;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB){
        this.colleagueB = colleagueB;
    }

    public abstract void action();
}
