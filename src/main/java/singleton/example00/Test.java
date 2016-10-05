package singleton.example00;

/**
 * Created by leibnik on 16-10-4.
 */
public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        // ceo对象只能通过getCEO函数获取
        Staff ceo1 = CEO.getCEO();
        Staff ceo2 = CEO.getCEO();
        company.addStaffs(ceo1);
        company.addStaffs(ceo2);
        //通过new创建VP对象
        Staff vp1 = new VP();
        Staff vp2 = new VP();
        // 通过new创建Staff对象
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();

        company.addStaffs(vp1);
        company.addStaffs(vp2);
        company.addStaffs(staff1);
        company.addStaffs(staff2);
        company.addStaffs(staff3);
        company.showAllStaffs();

        /*
        result:
         obj:singleton.example00.CEO@60e53b93
         obj:singleton.example00.CEO@60e53b93
         obj:singleton.example00.VP@5e2de80c
         obj:singleton.example00.VP@1d44bcfa
         obj:singleton.example00.Staff@266474c2
         obj:singleton.example00.Staff@6f94fa3e
         obj:singleton.example00.Staff@5e481248
         */
    }
}
