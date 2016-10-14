package composite.example11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leibnik on 16-10-14.
 */
public class Composite extends Component{

    private List<Component> components = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if (null != components){
            for (Component component : components){
                component.doSomething();
            }
        }
    }

    @Override
    public void addChild(Component child) {
        this.components.add(child);
    }

    @Override
    public void removeChild(Component child) {
        this.components.remove(child);
    }

    @Override
    public Component getChildren(int index) {
        Component child = components.get(index);
        return child;
    }
}
