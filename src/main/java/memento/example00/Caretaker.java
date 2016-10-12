package memento.example00;

/**
 * Created by leibnik on 16-10-12.
 */
public class Caretaker {
    Memoto mMemoto;

    public void archive(Memoto memoto) {
        mMemoto = memoto;
    }

    public Memoto getMemoto() {
        return mMemoto;
    }
}
