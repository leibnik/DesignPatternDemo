package singleton.example11;

/**
 * Created by leibnik on 16-10-4.
 */
public class Test {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.doSomething();
    }
}
