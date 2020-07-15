//AWT is a GUI for Java
package Block_Breaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Block Breaker"); // Name of window
		BlockBreakerPanel panel = new BlockBreakerPanel();

		frame.getContentPane().add(panel); // Add panel to frame
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 600);
		frame.setResizable(false);
	}
}
