package singleton.example11;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by leibnik on 16-10-4.
 */
public class NestedClassSingleton implements Serializable{
    private NestedClassSingleton(){
    }

    /**
     * 当第一次加载Singleton类时并不会初始化sInstance,
     * 只有在第一次调用Singleton的getInstance方法时才会导致sInstance被初始化
     * @return NestedClassSingleton
     */
    public static NestedClassSingleton getInstance(){
        return SingletonHolder.sInstance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static final NestedClassSingleton sInstance = new NestedClassSingleton();
    }

    /**
     * 即使构造函数是私有的，反序列时依然可以通过特殊的途径去创建类的一个新实例
     * 这个特殊得路径就是一个钩子函数readResolve(),可以让开发人员控制对象的反序列化
     * http://developer.51cto.com/art/201202/317181.htm
     */
    private Object readResolve() throws ObjectStreamException {
        return SingletonHolder.sInstance;
    }

}
