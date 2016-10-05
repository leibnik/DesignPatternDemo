package builder.example00;

/**
 * Created by leibnik on 16-10-5.
 */
public class MacbookBuilder extends Builder{

    private Computer mComputer = new Macbook();

    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    public void buildDisplayer(String displayer) {
        mComputer.setDisplayer(displayer);
    }


    public void buildOS() {
        mComputer.setOS();
    }

    public Computer create() {
        return mComputer;
    }
}
