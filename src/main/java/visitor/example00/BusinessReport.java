package visitor.example00;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by leibnik on 16-10-12.
 */
public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<Staff>();
    public BusinessReport(){
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("工程师-李三"));
        mStaffs.add(new Engineer("工程师-赵四"));
        mStaffs.add(new Engineer("工程师-胖哥"));
    }
    public void showReport(Visitor visitor){
        for (Staff staff : mStaffs){
            staff.accept(visitor);
        }
    }
}
