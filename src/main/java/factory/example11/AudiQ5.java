package factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class AudiQ5 extends AudiCar{

    @Override
    public void drive() {
        System.out.println("Q5启动啦");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q5自动巡航中......");
    }
}
