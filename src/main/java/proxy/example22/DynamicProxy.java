package proxy.example22;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by leibnik on 16-10-14.
 */
public class DynamicProxy implements InvocationHandler{

    private Object object;

    public DynamicProxy(Object obj){
        this.object = obj;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        Object result = method.invoke(object, objects);
        return result;
    }
}
