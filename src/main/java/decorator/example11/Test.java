package decorator.example11;

/**
 * Created by leibnik on 16-10-15.
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Boy();

        PersonCloth cheapCloth = new CheapCloth(person);
        cheapCloth.dressed();
        System.out.println("------------------------------");
        PersonCloth expensiveCloth = new ExpensiveCloth(person);
        expensiveCloth.dressed();

        /*
        result:

         穿了内衣内裤
         穿条短裤
         ------------------------------
         穿了内衣内裤
         穿件短袖
         穿件皮衣
         穿条牛仔裤
         */

    }
}
