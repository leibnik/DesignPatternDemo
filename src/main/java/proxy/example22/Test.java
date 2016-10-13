package proxy.example22;

import java.lang.reflect.Proxy;

/**
 * Created by leibnik on 16-10-14.
 */
public class Test {
    public static void main(String[] args) {
        ILawsuit xiaomin = new XiaoMin();
        // 构造一个动态代理
        DynamicProxy proxy = new DynamicProxy(xiaomin);
        // 获取被代理类的ClassLoader
        ClassLoader loader = xiaomin.getClass().getClassLoader();
        // 动态构造一个代理律师类
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, proxy);

        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
        /*
        老板拖欠工资，特此申请仲裁
        这是合同书和过去一年的银行工资流水
        证据确凿，不需要再说什么
        诉讼成功，判决老板即日起七天内结算工资
        */
    }
}
