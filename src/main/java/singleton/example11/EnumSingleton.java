package singleton.example11;

import java.io.ObjectStreamException;

/**
 * Created by leibnik on 16-10-4.
 *
 * 默认枚举的实例创建是线程安全的
 * JDK 5的enum类型已经自动处理了这个readresolve的情况
 * http://www.javalobby.org/java/forums/t17491.html
 */
public enum  EnumSingleton {
    INSTANCE;
    public void doSomething(){
        System.out.println("do sth.");
    }
}
