package builder.example11;

/**
 * Created by leibnik on 16-10-5.
 */
public class Test {
    public static void main(String[] args) {
        Builder builder = new MacbookBuilder();
        //现实开发过程中，Director角色通常被省略，而是直接使用一个builder来进行对象的组装
        //这种Builder通常采用链式调用的方式，即让每个setter方法都返回自身（return this）
        // builder模式可以参考android中AlertDialog的源码
        builder.buildBoard("英特尔主板")
                .buildDisplayer("Retina显示器")
                .buildOS();
        System.out.println(builder.create().toString());
    }
}
