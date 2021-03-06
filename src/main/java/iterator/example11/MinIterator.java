package iterator.example11;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leibnik on 16-10-12.
 */
public class MinIterator<T> implements Iterator{
    private List<T> list = new ArrayList<T>();
    private int cursor = 0;

    public MinIterator(List<T> list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public T next() {
        T obj = null;
        if (this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}
