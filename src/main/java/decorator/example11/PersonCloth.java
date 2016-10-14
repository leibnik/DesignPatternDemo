package decorator.example11;

/**
 * Created by leibnik on 16-10-15.
 */
public abstract class PersonCloth extends Person {

    private Person person;

    public PersonCloth(Person person){
        this.person = person;
    }

    @Override
    public void dressed() {
        person.dressed();
    }
}
