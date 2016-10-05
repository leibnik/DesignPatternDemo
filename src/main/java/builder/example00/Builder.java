package builder.example00;

/**
 * Created by leibnik on 16-10-5.
 */
public abstract class Builder {
    //设置主机
    public abstract void buildBoard(String board);
    //设置显示器
    public abstract void buildDisplayer(String displayer);
    //设置操作系统
    public abstract void buildOS();
    //创建计算机
    public abstract Computer create();
}
