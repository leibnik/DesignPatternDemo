package observer.example00;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by leibnik on 16-10-10.
 */
public class Coder implements Observer {

    private String name;

    public Coder(String name){
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object arg) {
        System.out.println("Hi,"+ name +",DevTechFrontier更新啦，内容："+arg);
    }

    @Override
    public String toString() {
        return "Coder{" +
                "name='" + name + '\'' +
                '}';
    }
}
