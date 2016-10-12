package iterator.example11;

/**
 * Created by leibnik on 16-10-12.
 */
public class Test {
    public static void main(String[] args) {
        HuiCompany huiCompany = new HuiCompany();
        check(huiCompany.interator());

        System.out.println("-------------------------------");

        MinCompany minCompany = new MinCompany();
        check(minCompany.interator());

        /*
        resutl:

         Employee{name='辉哥', age=108, sex='男', position='程序猿'}
         Employee{name='小红', age=98, sex='男', position='程序猿'}
         Employee{name='小辉', age=88, sex='男', position='程序猿'}
         -------------------------------
         Employee{name='小民', age=96, sex='男', position='程序猿'}
         Employee{name='小芸', age=22, sex='女', position='测试'}
         Employee{name='小方', age=18, sex='女', position='测试'}
         Employee{name='可儿', age=21, sex='女', position='设计'}
         Employee{name='朗情', age=19, sex='女', position='设计'}
         */
    }

    private static void check(Iterator interator) {
        while (interator.hasNext()) {
            System.out.println(interator.next());
        }
    }
}
