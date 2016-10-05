package singleton.example11;

import java.io.ObjectStreamException;

/**
 * Created by leibnik on 16-10-4.
 */
public class SimpleSingleton {
    // 懒汉模式
    // 优点： 实例在使用时才进行初始化，一定程度上节约了资源
    // 缺点： 初始化时可能反应稍慢，每次调用都要进行同步，造成不必要的同步开销
    private static SimpleSingleton sInstance;
    private SimpleSingleton(){

    }
    // 添加synchronized关键字是在多线程情况下保证单例对象唯一性的手段
    public static synchronized SimpleSingleton getSingleton(){
        if (sInstance == null){
            sInstance = new SimpleSingleton();
        }
        return sInstance;
    }

    /**
     * 即使构造函数是私有的，反序列时依然可以通过特殊的途径去创建类的一个新实例
     * 这个特殊得路径就是一个钩子函数readResolve(),可以让开发人员控制对象的反序列化
     * http://developer.51cto.com/art/201202/317181.htm
     */
    private Object readResolve() throws ObjectStreamException {
        return sInstance;
    }
}
