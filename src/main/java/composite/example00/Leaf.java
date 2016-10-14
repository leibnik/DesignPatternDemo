package composite.example00;

/**
 * Created by leibnik on 16-10-14.
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }
}
