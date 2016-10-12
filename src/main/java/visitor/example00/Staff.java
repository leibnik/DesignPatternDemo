package visitor.example00;

import java.util.Random;

/**
 * Created by leibnik on 16-10-12.
 */
public abstract class Staff {
    public String name;
    public int kpi;
    public Staff(String name){
        this.name = name;
        kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
