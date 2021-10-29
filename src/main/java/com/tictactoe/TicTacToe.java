package com.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TicTacToe extends BoardGame {
    protected char[] board;
    Player player;

    public TicTacToe(){
        this.board = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        this.player = Player.X; //presume that X is always first
    }

    int getNextPosition() throws IOException {
        System.out.println("Please enter next position (1 - 9)");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String position = reader.readLine();
        return Integer.getInteger(position);
    }


    @Override
    public boolean isDraw() {
        return !Arrays.toString(board).contains(" ");
    }

    @Override
    public boolean hasWinner() {
        if((board[0] == board[1] && board[1] == board[2] && board[0] != ' ')|| //row1
           (board[3] == board[1] && board[4] == board[5] && board[3] != ' ')|| //row2
           (board[6] == board[7] && board[7] == board[8] && board[6] != ' ')|| //row3
           (board[0] == board[3] && board[3] == board[6] && board[0] != ' ')|| //col1
           (board[1] == board[4] && board[4] == board[7] && board[1] != ' ')|| //col2
           (board[2] == board[5] && board[5] == board[8] && board[2] != ' ')|| //col3
           (board[0] == board[4] && board[4] == board[8] && board[0] != ' ')|| //diag1
           (board[2] == board[4] && board[4] == board[6] && board[2] != ' ') //diag2
        ){
            return true;
        }
        return false;
    }

    @Override
    public String getWinner() {
        return player.name(); //last playing player should be the winner
    }

    @Override
    public void play() throws IOException {
        int nextPositionIndex = getNextPosition()-1;
        if(board[nextPositionIndex] != ' '){
            board[nextPositionIndex] = player.name().charAt(0);
        }
        if(hasWinner()){
            System.out.println("Congratulations! The winner is player " + getWinner());
        } else if(isDraw()){
            System.out.println("No winner today, game over");
        } else {
            player.getNext();
        }

    }
}
