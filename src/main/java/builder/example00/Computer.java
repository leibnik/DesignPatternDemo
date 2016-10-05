package builder.example00;

/**
 * Created by leibnik on 16-10-5.
 */
public abstract class Computer {
    protected String mBoard;
    protected String mDisplayer;
    protected String mOS;

    protected Computer(){

    }

    public void setBoard(String board){
        mBoard = board;
    }

    public void setDisplayer(String displayer){
        mDisplayer = displayer;
    }
    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplayer='" + mDisplayer + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
