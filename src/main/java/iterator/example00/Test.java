package iterator.example00;

/**
 * Created by leibnik on 16-10-12.
 */
public class Test {
    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<String>();
        aggregate.add("Aige ");
        aggregate.add("Studio\n");
        aggregate.add("SM ");
        aggregate.add("Brother ");
        Iterator<String> iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }

        /*
         * result:
         * Aige Studio
         * SM Brother
         */
    }
}
