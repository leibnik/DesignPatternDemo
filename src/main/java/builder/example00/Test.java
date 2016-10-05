package builder.example00;

/**
 * Created by leibnik on 16-10-5.
 */
public class Test {
    public static void main(String[] args) {
        //构造器
        Builder builder = new MacbookBuilder();
        //主导者通常忽略，直接使用builder链式构造对象
        Director director = new Director(builder);
        //封装构建过程
        director.construct("英特尔主板","Retina显示器");
        //构建计算机，输出相关信息
        System.out.println("Computer Info :" + builder.create().toString());

        /**
         * result:
         * Computer Info :Computer{mBoard='英特尔主板', mDisplayer='Retina显示器', mOS='Mac OS X 10.10'}
         */
    }
}
