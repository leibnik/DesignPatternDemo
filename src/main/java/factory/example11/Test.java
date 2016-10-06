package factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class Test {
    public static void main(String[] args) {

        //构造一个生产汽车的工厂对象
        AudiFactory factory = new AudiCarFactory();

        // 生产q3并启动
        AudiCar q3 = factory.createAudiCar(AudiQ3.class);
        q3.drive();
        q3.selfNavigation();

        // 生产q5并启动
        AudiCar q5 = factory.createAudiCar(AudiQ5.class);
        q5.drive();
        q5.selfNavigation();

        // 生产q7并启动
        AudiCar q7 = factory.createAudiCar(AudiQ7.class);
        q7.drive();
        q7.selfNavigation();

        /*
           result:
            Q3启动啦
            Q3自动巡航中......
            Q5启动啦
            Q5自动巡航中......
            Q7启动啦
            Q7自动巡航中......
         */
    }
}
