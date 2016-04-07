package nl.youngcapital.platformgame;

import javax.swing.JFrame;

//https://www.eclipse.org/efxclipse/install.html

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("FrameDemo");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(new GamePaneel());
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		frame.add(new Character());
		
	}

}
