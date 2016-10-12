package memento.example00;

/**
 * Created by leibnik on 16-10-12.
 * 备忘录模式是在不破坏封装的条件下，通过备忘录对象(Memoto)存储另外一个对象内部状态的快照
 * ，在将来合适的时候把这个对象还原到存储起来的状态
 */
public class Test {
    public static void main(String[] args) {
        // 构建游戏对象
        CallOfDuty game = new CallOfDuty();
        // 打游戏
        game.play();
        // 游戏存档
        Caretaker caretaker = new Caretaker();
        caretaker.archive(game.createMemoto());

        // 退出游戏
        game.quit();

        // 恢复游戏
        CallOfDuty newGame = new CallOfDuty();
        newGame.restore(caretaker.getMemoto());

        /*
        result:

            打游戏：第1关奋战杀敌中
            进度升级啦
            到达 第2关
            --------------
            退出当前的游戏属性：CallOfDuty{mCheckPoint=2, mLifeValue=90, mWeapon='沙漠之鹰'}
            退出游戏
            ----------------
            恢复后的游戏属性：CallOfDuty{mCheckPoint=2, mLifeValue=90, mWeapon='沙漠之鹰'}
         */
    }
}
