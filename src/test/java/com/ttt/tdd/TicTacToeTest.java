package com.ttt.tdd;


import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.ttt.exception.TicTacToeException;

public class TicTacToeTest {
	
	 @Rule
	    public ExpectedException exception = ExpectedException.none();
	     TicTacToe ticTacToe = new TicTacToe();

	     @Test
	 	public void initializeNewTicTacToeGame() {
	 		TicTacToe1 tictactoe1 = new TicTacToe1();
	 		assertNotNull(tictactoe1);
	 	}

	    @Test
	    public void RunTimeExceptionFoundWhenXOutsideOfBoard() {
	        exception.expect(TicTacToeException.class);
	        ticTacToe.play(5, 2);
	    }
	    
	    @Test
	    public void RunTimeExceptionFoundWhenYOutsideOfBoard() {
	        exception.expect(TicTacToeException.class);
	        ticTacToe.play(2, 6);
	    }

		

	    
	   

}
	
	            
