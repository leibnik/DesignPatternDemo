package factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class AudiQ7 extends AudiCar{
    @Override
    public void drive() {
        System.out.println("Q7启动啦");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q7自动巡航中......");
    }
}
