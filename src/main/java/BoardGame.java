import java.io.IOException;

public abstract class BoardGame implements Game{
    public char[] board;
    public Player player;
    public abstract boolean isDraw();
    public abstract boolean hasWinner();
    public abstract String getWinner();
    public abstract void play() throws IOException;


}
