import javax.swing.JFrame;

/***********************************************************************
 * Main GUI for the Checker's Game
 * 
 * @author Jennifer Moon
 * @version V2
 **********************************************************************/
public class ModelBoard2 {

	public static void main (String[] args){
		JFrame frame = new JFrame("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ModelBoard model = new ModelBoard();
		frame.getContentPane().add(model);
		frame.setVisible(true);
		frame.setSize(780, 805);
	}
}
