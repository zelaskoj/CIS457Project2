import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/***********************************************************************
 * Temporary board used to check piece movement
 *
 **********************************************************************/
public class ModelBoard extends JPanel {

	public JButton[][] board;
	public Chess chess; 
	
	public int lrow; 
	public int lcolumn; 

	public ModelBoard() {
		
		//create the board 
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(8,8,5,5));
		
		chess = new Chess();
		board = new JButton[8][8];
		ButtonListener listener = new ButtonListener();

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = new JButton("");
				board[i][j].setPreferredSize(new Dimension(90, 90));
				board[i][j].addActionListener(listener);
				panel.add(board[i][j]);

			}
		}
		
		add(panel, BorderLayout.CENTER);
		displayBoard();
		setRegColor();
	}
	
	private void displayBoard() {
		CheckersPiece[][] temp = chess.getBoard();
		
		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				if (temp[i][j] != null)
					board[i][j].setText(temp[i][j].getName());
				else 
					board[i][j].setText("");
	}
	
	private void setAvailable(boolean[][] spots) {
		setRegColor();
		for (int i = 0; i < 8; i ++)
			for (int j = 0; j < 8; j++) {
				if (spots [i][j] == true) {
					board[i][j].setBackground(Color.GREEN);
				} /*else {
					board[i][j].setBackground(Color.RED);
				}*/
			}
	}
	
	private void setRegColor(){
		
		for (int j = 0; j < 8; j = j + 2)
			for (int i = 0; i < 8; i ++){
				if (i % 2 == 0)
					board[i][j].setBackground(Color.GRAY);
				else 
					board[i][j].setBackground(Color.WHITE);
			}
		
		for (int j = 1; j < 8; j = j + 2)
			for (int i = 0; i < 8; i ++){
				if (i % 2 == 1)
					board[i][j].setBackground(Color.GRAY);
				else 
					board[i][j].setBackground(Color.WHITE);
			}
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			for (int i = 0; i < 8; i++) 
				for (int j = 0; j < 8; j++) {
					if (board[i][j] == e.getSource()) {
						if (board[i][j].getBackground() != Color.GREEN){
							setAvailable(chess.getMoves(i, j));
							lrow = i; 
							lcolumn = j;
						} else {
							chess.move(lrow, lcolumn, i, j);
							setRegColor();
						}	
					}
				}

			displayBoard();
		}
	}
}
