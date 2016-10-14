package adapter.example00;

/**
 * Created by leibnik on 16-10-15.
 * 类适配器模式
 */
public class Test {
    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter();
        System.out.println("输出电压：" +adapter.getVolt5());
    }
}
