import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TicTacToeTest {
    @Test
    public void getNextPlayerTest(){
        //Arrange
        Player player = Player.X;
        //Act
        Player nextPlayer = player.getNext();
        //Assert
        assertTrue(nextPlayer.name().equals("O"));
    }

    @Test
    public void createTickTackToe(){
        TicTacToe ttt = new TicTacToe();

    }

    @Test
    public void winGameColTest(){
        TicTacToeSub ttt = new TicTacToeSub();
        ttt.setBoard(new char[]{'X', 'O', ' ', 'X', 'O', ' ', 'X', ' ', ' ',});

        assertTrue(ttt.getWinner().equals("X"));

    }

    @Test
    public void winGameRowTest(){
        TicTacToeSub ttt = new TicTacToeSub();
        ttt.setBoard(new char[]{'X', 'X', 'X', 'O', 'O', ' ', ' ', ' ', ' ',});

        assertTrue(ttt.getWinner().equals("X"));

    }

    @Test
    public void isDrawTest(){
        TicTacToeSub ttt = new TicTacToeSub();
        ttt.setBoard(new char[]{'X', 'X', 'O', 'O', 'O', 'X', 'X', 'O', 'X',});

        assertTrue(ttt.isDraw());

    }
}
