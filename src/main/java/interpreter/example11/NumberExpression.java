package interpreter.example11;

/**
 * Created by leibnik on 16-10-9.
 */
public class NumberExpression extends ArithmeticExpression {
    private int num;

    public NumberExpression(int num){
        this.num = num;
    }
    @Override
    public int interpreter() {
        return num;
    }
}
