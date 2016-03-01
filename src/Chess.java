/***********************************************************************
 * Chess controller class
 * 
 * @author Jennifer Moon
 **********************************************************************/
public class Chess {
	
	/** Chess Board **/
	private CheckersPiece[][] board; 
	
	//White = 1, top
	//Black = -1, bottom
	
	/*******************************************************************
	 * Constructor used to create a new game of Chess with the pieces 
	 * in the starting position 
	 ******************************************************************/
	public Chess(){
		board = new CheckersPiece[8][8];
		
		board[0][0] = new Rook(1);
		board[0][1] = new Knight(1);
		board[0][2] = new Bishop(1);
		board[0][3] = new Queen(1);
		board[0][4] = new King(1);
		board[0][5] = new Bishop(1);
		board[0][6] = new Knight(1);
		board[0][7] = new Rook(1);
		
		board[1][0] = new Pawn(1);
		board[1][1] = new Pawn(1); 
		board[1][2] = new Pawn(1);
		board[1][3] = new Pawn(1);
		board[1][4] = new Pawn(1);
		board[1][5] = new Pawn(1);
		board[1][6] = new Pawn(1);
		board[1][7] = new Pawn(1);
		
		board[6][0] = new Pawn(-1);
		board[6][1] = new Pawn(-1);
		board[6][2] = new Pawn(-1);
		board[6][3] = new Pawn(-1);
		board[6][4] = new Pawn(-1);
		board[6][5] = new Pawn(-1);
		board[6][6] = new Pawn(-1);
		board[6][7] = new Pawn(-1);
		
		board[7][0] = new Rook(-1);
		board[7][1] = new Knight(-1);
		board[7][2] = new Bishop(-1);
		board[7][3] = new Queen(-1);
		board[7][4] = new King(-1);
		board[7][5] = new Bishop(-1);
		board[7][6] = new Knight(-1);
		board[7][7] = new Rook(-1);
	}
	
	/*******************************************************************
	 * Returns an array of possible moves given a specific checkers 
	 * piece 
	 * 
	 * @param row, the row of the piece
	 * @param col, the column of the piece 
	 * @return boolean array of possible places a piece can move 
	 ******************************************************************/
	public boolean[][] getMoves(int row, int col){
		
		CheckersPiece temp = board[row][col];
		
		return temp.getMoves(row, col, board);
	}
	
	/*******************************************************************
	 * Removes the checkers piece at the given position 
	 * 
	 * @param row, the row of the piece 
	 * @param col, the column of the piece 
	 ******************************************************************/
	public void remove(int row, int col){
		board[row][col] = null;
	}
}
