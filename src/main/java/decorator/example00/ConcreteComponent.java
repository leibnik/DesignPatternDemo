package decorator.example00;

/**
 * Created by leibnik on 16-10-15.
 */
public class ConcreteComponent extends Component{
    @Override
    public void operate() {
        System.out.println("ConcreteComponent");
    }
}
