import javax.swing.JFrame;

public class ModelBoard2 {

	public static void main (String[] args){
		JFrame frame = new JFrame("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ModelBoard model = new ModelBoard();
		frame.getContentPane().add(model);
		frame.setVisible(true);
		frame.setSize(700, 300);
	}
}
