package visitor.example00;

import java.util.Random;

/**
 * Created by leibnik on 16-10-12.
 */
public class Manager extends Staff{

    private int products;

    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts(){
        return products;
    }


}
