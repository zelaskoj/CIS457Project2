/***********************************************************************
 * Bishop checkers piece. The bishop can move in any diagonal any
 * number of spaces so long as it is not obstructed by another piece. 
 * 
 * @author Jennifer Moon
 **********************************************************************/
public class Bishop extends CheckersPiece{
	/* Piece Type */
	private String name; 
	
	/* Color of Piece */
	private int color; 
	
	/******************************************************************
	 * Creates the bishop piece with the name "Bishop" and the given 
	 * color
	 * 
	 * @param the color of the piece 
	 ******************************************************************/
	public Bishop(int color){
		name = "Bishop";
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
	public boolean[][] getMoves(int row, int col, 
			CheckersPiece[][] board) {
		
		boolean[][] moves = new boolean[8][8];
		boolean cont = true; 
		
		//Positive slope, positive direction 
		int i = row + 1; 
		int j = col + 1; 
		cont = true; 
		
		while (i < 8 && j < 8 && cont){
			if(board[i][j] == null){
				moves[i][j] = true; 
				i++;
				j++; 
			} else {
				cont = false; 
			}
		}
		
		//Positive slope, negative direction 
		i = row - 1; 
		j = col - 1; 
		cont = true;
		
		while (i >= 0 && j >= 0 && cont){
			if(board[i][j] == null){
				moves[i][j] = true; 
				i--; 
				j--; 
			} else {
				cont = false; 
			}
		}
		
		//Negative slope, positive direction 
		i = row - 1; 
		j = col + 1; 
		cont = true;
		
		while (i >= 0 && j < 8 && cont){
			if (board[i][j] == null){
				moves[i][j] = true; 
				i--;
				j++;
			} else {
				cont = false; 
			}
		}
		
		//Negative slope, negative direction 
		i = row + 1; 
		j = col - 1; 
		cont = true;
		
		while (i < 8 && j >= 0 && cont){
			if(board[i][j] == null){
				moves[i][j] = true; 
				i++;
				j--;
			} else {
				cont = false; 
			}
		}
		
		//Currently the bishop can only move to empty spaces and 
		//cannot jump 
		return moves;
	}

	/******************************************************************
	 * Returns the name of the piece 
	 * 
	 * @return the name of the piece 
	 ******************************************************************/
	@Override
	public String getPiece() {
		return name; 
	}

	/******************************************************************
	 * Returns the color of the piece 
	 * 
	 * @return the color of the piece 
	 ******************************************************************/
	@Override
	public int getColor() {
		return color; 
	}
	
	/******************************************************************
	 * Returns the name of the piece 
	 * 
	 * @return the name of the piece 
	 ******************************************************************/
	@Override
	String getName() {
		return name; 
	}
}
