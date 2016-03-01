/***********************************************************************
 * Pawn checkers piece. The pawn can move only one space forward, must
 * capture diagonally, and can move one or two spaces forward on the 
 * first turn 
 * 
 * @author Jennifer Moon
 **********************************************************************/
public class Pawn extends CheckersPiece{
	
	/* Piece Type */
	private String name; 
	
	/* Color of Piece */
	private int color; 
	
	/******************************************************************
	 * Creates the pawn piece with the name "Pawn" and the given color
	 * 
	 * @param the color of the piece 
	 ******************************************************************/
	public Pawn(int color){
		name = "Pawn";
		this.color = color; 
	}

	/******************************************************************
	 * Returns an array of type boolean listing the possible places 
	 * the piece may move 
	 * 
	 * @param row, the row the piece is in 
	 * @param col, the column the piece is in 
	 * @param board, the layout of the board
	 * @return an array of the possible moves 
	 ******************************************************************/
	@Override
	boolean[][] getMoves(int row, int col, CheckersPiece[][] board) {
		
		boolean[][] moves = new boolean[8][8];
		
		//White piece (moves top down) 
		if (color == 1){
			
			if (row - 1 > 0){
				
				if (board[row - 1][col] == null)
					moves[row-1][col] = true; 
				
				if (col - 1 >= 0)
					if (board[row - 1][col - 1] == null)
						moves[row - 1][col - 1] = true; 

				if (col + 1 < 8)
					if (board[row - 1][col - 1] == null)
						moves[row - 1][col - 1] = true; 
			}
			
		//Black piece (moves bottom up) 
		} else if (color == -1){
			
			if (row + 1 < 8){
				
				if (board[row + 1][col] == null)
					moves[row + 1][col] = true; 
				
				if (col - 1 >= 0)
					if (board[row + 1][col - 1] == null)
						moves[row + 1][col - 1] = true; 

				if (col + 1 < 8)
					if (board[row + 1][col + 1] == null)
						moves[row + 1][col + 1] = true; 
			}
		}
		
		//Currently the pawn can only move to empty spaces 
		return moves;
	}

	/******************************************************************
	 * Returns the name of the piece 
	 * 
	 * @return the name of the piece 
	 ******************************************************************/
	@Override
	String getPiece() {
		return name; 
	}

	/******************************************************************
	 * Returns the color of the piece 
	 * 
	 * @return the color of the piece 
	 ******************************************************************/
	@Override
	int getColor() {
		return color; 
	}

}
