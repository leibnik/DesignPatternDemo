package interpreter.example11;

/**
 * Created by leibnik on 16-10-9.
 */
public class Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("12 / 6 * 5 + 7 + 8 - 1");
        System.out.println(calculator.calculate());
    }
}
