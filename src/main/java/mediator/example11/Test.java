package mediator.example11;

/**
 * Created by leibnik on 16-10-13.
 */
public class Test {
    public static void main(String[] args) {
        MainBoard mainBoard = new MainBoard();

        //分别构造各个零部件
        CDDevice  cd = new CDDevice(mainBoard);
        CPU cpu = new CPU(mainBoard);
        GraphicsCard vc = new GraphicsCard(mainBoard);
        SoundCard sc = new SoundCard(mainBoard);

        mainBoard.setCDDevice(cd);
        mainBoard.setCpu(cpu);
        mainBoard.setGraphicsCard(vc);
        mainBoard.setSoundCard(sc);

        cd.load();
    }
}
