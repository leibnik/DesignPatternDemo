package builder.example00;

/**
 * Created by leibnik on 16-10-5.
 */
public class Director {
    Builder mBuilder = null;
    public Director(Builder builder){
        mBuilder = builder;
    }
    public void construct(String board, String display){
        mBuilder.buildBoard(board);
        mBuilder.buildDisplayer(display);
        mBuilder.buildOS();
        mBuilder.create();
    }

}
