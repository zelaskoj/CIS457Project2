/***********************************************************************
 * Rook checkers piece. The rook can move in any row or column any 
 * number of spaces so long as they are not obstructed 
 * 
 * @author Jennifer Moon
 **********************************************************************/
public class Rook extends CheckersPiece {

	/* Piece Type */
	private String name;
	
	/* Color of Piece */
	private int color;
	
	/******************************************************************
	 * Creates the rook piece with the name "Rook" and the given color
	 * 
	 * @param the color of the piece 
	 ******************************************************************/
	public Rook(int color){
		name = "Rook";
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
		
		//Same column, positive direction 
		int i = row + 1; 
		while (i < 8 && cont){
			if (board[i][col] == null) {
				moves[i][col] = true; 
				i++;
			} else {
				cont = false; 
			}
		}
		
		//Same column, negative direction 
		i = row - 1; 
		cont = true; 
		while (i >= 0 && cont){
			if (board[i][col] == null) {
				moves[i][col] = true; 
				i--;
			} else {
				cont = false; 
			}
		}
		
		//Same row, positive direction 
		int j = col + 1; 
		cont = true; 
		while (j < 8 && cont){
			if (board[row][j] == null) {
				moves[row][j] = true; 
				j++;
			} else {
				cont = false; 
			}
		}
		
		//Same row, negative direction 
		j = col - 1; 
		cont = true; 
		while (j >= 0 && cont){
			if (board[row][j] == null) {
				moves[row][j] = true; 
				j--;
			} else {
				cont = false; 
			}
		}
		
		//Currently the rook can only move to empty spaces and 
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
}