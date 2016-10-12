package iterator.example11;

/**
 * Created by leibnik on 16-10-12.
 */
public class HuiInterator<Employee> implements Iterator{

    private Employee[] array;
    private int position;

    public HuiInterator(Employee[] array){
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return !(position > array.length - 1 || array[position] == null);
    }

    @Override
    public Employee next() {
        Employee employee = array[position];
        position++;
        return employee;
    }
}
