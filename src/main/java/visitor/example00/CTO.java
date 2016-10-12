package visitor.example00;

/**
 * Created by leibnik on 16-10-12.
 */
public class CTO implements Visitor{
    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + ",产品数量：" + manager.getProducts());
    }

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + ",代码量：" + engineer.getCodeLines());
    }
}
