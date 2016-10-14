package decorator.example11;

/**
 * Created by leibnik on 16-10-15.
 */
public class Boy extends Person{
    @Override
    public void dressed() {
        System.out.println("穿了内衣内裤");
    }
}
