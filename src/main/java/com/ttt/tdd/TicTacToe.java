package com.ttt.tdd;

import com.ttt.exception.TicTacToeException;

public class TicTacToe {
	
	private Character[][] board = {{'\0', '\0', '\0'},
            						{'\0', '\0', '\0'},
            						{'\0', '\0', '\0'}};
	 
	 public void play(int column, int row) {		 
		 checkAxis(column, "X value is outside the board!");
		 setField(column, row);
	    }
	 
	 private void checkAxis(int axis, String message) {
	        if (axis < 1 || axis > 3) {
	            throw new TicTacToeException(message);
	        }
}
	 private void setField(int column, int row) {
	        if (board[column - 1][row - 1] != '\0') {
	            throw new RuntimeException("Field is occupied!");
	        } else {
	            board[column - 1][row - 1] = 'X';
	        }
	    }
}
