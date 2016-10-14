package adapter.example11;

/**
 * Created by leibnik on 16-10-15.
 * 对象适配器模式
 */
public class Test {
    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter(new Volt220());
        System.out.println("输出电压：" + adapter.getVolt5());
    }
}
