package composite.example22;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leibnik on 16-10-14.
 */
public abstract class Dir {

    protected List<Dir> dirs = new ArrayList<Dir>();

    private String name;

    public Dir(String name){
        this.name = name;
    }

    public abstract void addDir(Dir dir);

    public abstract void rmDir(Dir dir);

    public abstract void clear();

    public abstract void print();

    public abstract List<Dir> getFiles();

    public String getName(){
        return name;
    }
}
