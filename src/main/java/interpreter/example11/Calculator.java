package interpreter.example11;

import java.util.Stack;

/**
 * Created by leibnik on 16-10-9.
 */
public class Calculator {
    //声明一个栈存储并操作所有相关的解释器
    private Stack<ArithmeticExpression> mExpStack = new Stack<ArithmeticExpression>();

    public Calculator(String expression){
        // 声明两个ArithmeticExpression类型的临时变量，存储运算符左右两边的解释器
        ArithmeticExpression exp1, exp2;
        // 根据空格分割表达式字符串
        String[] elements = expression.split(" ");

        for (int i = 0; i < elements.length; i++){
            switch (elements[i].charAt(0)){
                case '+':
                    exp1 = mExpStack.pop();
                    exp2 = new NumberExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new AdditionExpression(exp1, exp2));
                    break;
                case '-':
                    exp1 = mExpStack.pop();
                    exp2 = new NumberExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new SubtractionExpression(exp1, exp2));
                    break;
                case '/':
                    exp1 = mExpStack.pop();
                    exp2 = new NumberExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new DivisionExpression(exp1, exp2));
                    break;
                case '*':
                    exp1 = mExpStack.pop();
                    exp2 = new NumberExpression(Integer.valueOf(elements[++i]));
                    mExpStack.push(new MultiplicationExpression(exp1, exp2));
                    break;
                default:
                    mExpStack.push(new NumberExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    public int calculate(){
        return mExpStack.pop().interpreter();
    }
}
