package visitor.example00;

/**
 * Created by leibnik on 16-10-12.
 */
public class Test {
    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        System.out.println("==========给CEO看的报表=========");
        report.showReport(new CEO());
        System.out.println("==========给CTO看的报表=========");
        report.showReport(new CTO());

        /*result:

         ==========给CEO看的报表=========
         经理：王经理,KPI:7
         工程师：工程师-李三,KPI:8
         工程师：工程师-赵四,KPI:5
         工程师：工程师-胖哥,KPI:8
         ==========给CTO看的报表=========
         经理：王经理,产品数量：9
         工程师：工程师-李三,代码量：92379
         工程师：工程师-赵四,代码量：12852
         工程师：工程师-胖哥,代码量：62811
         */
    }
}
