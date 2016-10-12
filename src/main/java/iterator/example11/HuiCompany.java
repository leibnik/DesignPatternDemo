package iterator.example11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leibnik on 16-10-12.
 */
public class HuiCompany implements Company {

    private Employee[] array = new Employee[3];

    public HuiCompany() {
        array[0] = new Employee("辉哥", 108, "男", "程序猿");
        array[1] = new Employee("小红", 98, "男", "程序猿");
        array[2] = new Employee("小辉", 88, "男", "程序猿");
    }

    public Employee[] getEmployees(){
        return array;
    }

    @Override
    public Iterator interator() {
        return new HuiInterator(array);
    }
}
