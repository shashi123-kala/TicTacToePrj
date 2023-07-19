package com.ttt.tdd;


import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
	    
	    @Test
	   	 public void whenOccupiedThenRuntimeException() {
	        exception.expect(TicTacToeException.class);
	        ticTacToe.play(2, 1);
	    	}
	    
	    @Test
    	public void playWithX() {
        assertEquals('X', ticTacToe.playWithPlayer());
    	}
	    
	    @Test
    	public void whenPlayThenNoWinner() {
        	String actual = ticTacToe.play(1,1);
        	assertEquals("No winner", actual);
    	}
	    
	    @Test
	    public void whenPlayAndWholeHorizontalLineThenWinner() {
	        ticTacToe.play(1,1); // X
	        ticTacToe.play(1,2); // O
	        ticTacToe.play(2,1); // X
	        ticTacToe.play(2,2); // O
	        String actual = ticTacToe.play(3,1); // X
	        assertEquals("X is the Winner", actual);
	    }
	    
	    @Test
	    public void whenPlayAndWholeVerticalLineThenWinner() {
	        ticTacToe.play(2,1); // X
	        ticTacToe.play(1,1); // O
	        ticTacToe.play(3,1); // X
	        ticTacToe.play(1,2); // O
	        ticTacToe.play(2,2); // X
	        String actual = ticTacToe.play(1,3); // O
	        assertEquals("O is the Winner", actual);
	    }
	    
	    
	

		

	    
	   

}
	
	            
