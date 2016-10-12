package iterator.example00;

/**
 * Created by leibnik on 16-10-12.
 */
public interface Aggregate<T> {
    void add(T obj);

    void remove(T obj);

    Iterator<T> iterator();
}
