package composite.example11;

/**
 * Created by leibnik on 16-10-14.
 */
public abstract class Component {
    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void doSomething();

    public abstract void addChild(Component child);

    public abstract void removeChild(Component child);

    public abstract Component getChildren(int index);

}
