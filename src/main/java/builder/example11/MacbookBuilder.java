package builder.example11;

/**
 * Created by leibnik on 16-10-5.
 */
public class MacbookBuilder extends Builder{

    private Computer mComputer = new Macbook();

    public MacbookBuilder buildBoard(String board) {
        mComputer.setBoard(board);
        return this;
    }

    public MacbookBuilder buildDisplayer(String displayer) {
        mComputer.setDisplayer(displayer);
        return this;
    }


    public MacbookBuilder buildOS() {
        mComputer.setOS();
        return this;
    }

    public Computer create() {
        return mComputer;
    }
}
