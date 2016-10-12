package visitor.example00;

import java.util.Random;

/**
 * Created by leibnik on 16-10-12.
 */
public class Engineer extends Staff{


    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines(){
        return new Random().nextInt(10 * 10000);
    }
}
