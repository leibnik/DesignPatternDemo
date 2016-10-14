package composite.example00;

/**
 * Created by leibnik on 16-10-14.
 */
public abstract class Component {
    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void doSomething();
}
