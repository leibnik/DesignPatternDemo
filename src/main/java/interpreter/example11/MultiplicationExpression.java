package interpreter.example11;

/**
 * Created by leibnik on 16-10-9.
 */
public class MultiplicationExpression extends OperatorExpression{

    public MultiplicationExpression(ArithmeticExpression exp1, ArithmeticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpreter() {
        return exp1.interpreter() * exp2.interpreter();
    }
}
