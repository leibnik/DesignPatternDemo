package singleton.example00;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leibnik on 16-10-4.
 */
public class Company {
    private List<Staff> allStaffs = new ArrayList<Staff>();
    public void addStaffs(Staff staff){
        allStaffs.add(staff);
    }
    public void showAllStaffs(){
        for (Staff per: allStaffs) {
            System.out.println("obj:" + per.toString());
        }
    }
}
