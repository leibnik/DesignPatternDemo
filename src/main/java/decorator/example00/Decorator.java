package decorator.example00;

/**
 * Created by leibnik on 16-10-15.
 */
public class Decorator extends Component {

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
