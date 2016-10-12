package visitor.example00;

/**
 * Created by leibnik on 16-10-12.
 */
public class CEO implements Visitor{
    @Override
    public void visit(Manager manager) {
        System.out.println("经理："+ manager.name + ",KPI:" + manager.kpi);
    }

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + ",KPI:" + engineer.kpi);
    }
}
