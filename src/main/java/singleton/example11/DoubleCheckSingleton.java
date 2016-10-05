package singleton.example11;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by leibnik on 16-10-4.
 */
public class DoubleCheckSingleton implements Serializable{

    //Double check Singleton
    // 优点： 资源利用率高
    // 缺点： 第一次加载时反应稍慢，不适宜高并发场景和低于jdk6版本的情况下使用
    private volatile static DoubleCheckSingleton sInstance;

    private DoubleCheckSingleton() {

    }

    public static DoubleCheckSingleton getSingleton() {

        if (sInstance == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (sInstance == null) {
                    sInstance = new DoubleCheckSingleton();
                }
            }
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

