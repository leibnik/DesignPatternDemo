package iterator.example11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leibnik on 16-10-12.
 */
public class MinCompany implements Company {

    private List<Employee> list = new ArrayList<Employee>();

    public MinCompany(){
        list.add(new Employee("小民",96,"男","程序猿"));
        list.add(new Employee("小芸",22,"女","测试"));
        list.add(new Employee("小方",18,"女","测试"));
        list.add(new Employee("可儿",21,"女","设计"));
        list.add(new Employee("朗情",19,"女","设计"));
    }

    public List<Employee> getEmployees() {
        return list;
    }

    @Override
    public Iterator interator() {
        return new MinIterator(list);
    }
}
