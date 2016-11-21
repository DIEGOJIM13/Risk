package Window;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class driver extends JFrame{
	public driver(){
		super("A simple window");
		final int WINDOW_WIDTH = 500, WINDOW_HEGIHT = 500;
		setSize(WINDOW_WIDTH, WINDOW_HEGIHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		WindowMain w = new WindowMain();
	}

}