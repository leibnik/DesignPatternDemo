package template.example00;

/**
 * Created by leibnik on 16-10-12.
 *
 * 模板方法模式：
 * 定义一个操作中的算法框架，将一些不走延迟到子类中，
 * 使得子类可以不改变一个算法结构即可重定义该算法的某些特定步骤
 *
 * 使用场景：
 * 1. 多个子类有公有的方法，并且逻辑基本相同
 * 2. 重要，复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现
 * 3. 重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数约束其行为
 */
public class Test {
    public static void main(String[] args) {
        AbstractComputer computer = new CoderComputer();
        computer.startUp();

        computer = new MilitaryComputer();
        computer.startUp();
    }
}
