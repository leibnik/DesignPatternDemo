package decorator.example11;

/**
 * Created by leibnik on 16-10-15.
 */
public class CheapCloth extends PersonCloth{

    public CheapCloth(Person person) {
        super(person);
    }

    public void dressShorts(){
        System.out.println("穿条短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
