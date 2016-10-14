package composite.example00;

/**
 * Created by leibnik on 16-10-14.
 *
 * 安全的组合模式，与依赖倒置原则相违背
 */
public class Test {
    public static void main(String[] args) {
        Composite root = new Composite("Root");

        //构造两个枝干节点
        Composite branch1 = new Composite("Branch1");
        Composite branch2 = new Composite("Branch2");

        //构造两个叶子节点
        Leaf leaf1 = new Leaf("Leaf1");
        Leaf leaf21 = new Leaf("Leaf2 - 1");
        Leaf leaf22 = new Leaf("Leaf2 - 2");

        branch1.addChild(leaf1);
        branch2.addChild(leaf21);
        branch2.addChild(leaf22);

        root.addChild(branch1);
        root.addChild(branch2);

        // 执行方法
        root.doSomething();

    }
}
