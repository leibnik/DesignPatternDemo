package composite.example11;

/**
 * Created by leibnik on 16-10-14.
 */
public class Test {
    public static void main(String[] args) {
        Component root = new Composite("Root");

        Component branch1 = new Composite("Branch-1");
        Component branch2 = new Composite("Branch-2");

        Component leaf1 = new Leaf("Leaf-1");
        Component leaf21 = new Leaf("Leaf-2-1");
        Component leaf22 = new Leaf("Leaf-2-2");


        branch1.addChild(leaf1);
        branch2.addChild(leaf21);
        branch2.addChild(leaf22);

        root.addChild(branch1);
        root.addChild(branch2);
        root.doSomething();
    }
}
