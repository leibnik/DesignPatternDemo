package iterator.example00;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leibnik on 16-10-12.
 */
public class ConcreteAggregate<T> implements Aggregate<T> {

    private List<T> list = new ArrayList<T>();

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator(list);
    }
}
