package com.tictactoe;

public enum Player {
    X, O;

    private static Player[] vals = values();
    public Player getNext(){
        return vals[(this.ordinal()+1) % vals.length];
    }}
