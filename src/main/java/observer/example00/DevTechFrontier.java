package observer.example00;

import java.util.Observable;

/**
 * Created by leibnik on 16-10-10.
 */
public class DevTechFrontier extends Observable{
    public void postNewPublication(String content){
        setChanged();
        notifyObservers(content);
    }
}
