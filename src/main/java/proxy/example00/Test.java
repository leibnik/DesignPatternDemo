package proxy.example00;

/**
 * Created by leibnik on 16-10-14.
 */
public class Test {
    public static void main(String[] args) {
        // 构造一个真实主题对象
        RealSubject real = new RealSubject();
        // 通过真实主题构造一个代理对象
        ProxySubject proxy = new ProxySubject(real);
        // 调用代理的相关方法
        proxy.visit();
    }
}
