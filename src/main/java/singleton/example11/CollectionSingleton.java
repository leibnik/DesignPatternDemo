package singleton.example11;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leibnik on 16-10-4.
 * 在程序的初始，将多个单例类型注入到一个管理类中，在使用时根据key获得对象对应类型的对象
 */
public class CollectionSingleton {
    private static Map<String,Object> objMap = new HashMap<String,Object>();

    private CollectionSingleton(){

    }
    public static void registerService(String key, Object obj){
        if (!objMap.containsKey(key)){
            objMap.put(key, obj);
        }
    }

    public static Object getService(String key){
        return objMap.get(key);
    }
}
