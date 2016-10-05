package singleton.example00;

/**
 * Created by leibnik on 16-10-4.
 */
public class CEO extends Staff{

    // 饿汉模式
    private static final CEO ceo = new CEO();

    public static CEO getCEO(){
        return ceo;
    }

    //私有化构造器
    private CEO(){

    }
    @Override
    public void work() {
        // 管理vp
    }
}
