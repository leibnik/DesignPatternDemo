package factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class AudiQ3 extends AudiCar{
    @Override
    public void drive() {
        System.out.println("Q3启动啦");
    }

    @Override
    public void selfNavigation() {
        System.out.println("Q3自动巡航中......");
    }
}
