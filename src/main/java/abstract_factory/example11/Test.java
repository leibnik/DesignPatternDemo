package abstract_factory.example11;

/**
 * Created by leibnik on 16-10-6.
 */
public class Test {
    public static void main(String[] args) {

        // 构造一个生产Q3的工厂对象
        CarFactory q3Factory = new Q3Factory();
        q3Factory.createTire().tire();
        q3Factory.createEngine().engine();
        q3Factory.createBrake().brake();

        System.out.println("=================================");

        //构建一个生产Q7的工厂对象
        CarFactory q7Factory = new Q7Factory();
        q7Factory.createTire().tire();
        q7Factory.createEngine().engine();
        q7Factory.createBrake().brake();

        /*
            result:
            普通轮胎
            国产发动机
            普通制动
            =================================
            越野轮胎
            进口发动机
            高级制动
         */
    }
}
