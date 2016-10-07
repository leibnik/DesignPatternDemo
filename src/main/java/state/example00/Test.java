package state.example00;

/**
 * Created by leibnik on 16-10-7.
 *
 * 状态模式把对象的行为封装在不同的状态对象中，
 * 每一个状态对象都有一个共同的抽象状态基类。
 * 状态模式的意图是让一个对象在其内部状态改变的时候，其行为也随之改变。
 *
 * 在结构上与策略模式十分相似，它们的区别在于：
 *      状态模式的行为是平行的、不可替换的；
 *      策略模式的行为是彼此独立、可相互替换的；
 */
public class Test {
    public static void main(String[] args) {
        TVController controller = new TVController();
        //设置开机状态
        controller.powerOn();
        //下一个频道
        controller.nextChannel();
        //调高音量
        controller.turnUp();
        // 设置关机状态
        controller.powerOff();
        // 此时调高音量不会生效
        controller.turnUp();

        /*
        result:
                开机啦
                下一个频道
                开机啦
                关机啦
         */
    }
}
