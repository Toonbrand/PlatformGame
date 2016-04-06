package nl.youngcapital.platformgame;

import javax.swing.JFrame;

public class Test {
	
	
	static int width=1000;
	static int height=1000;
	static GameWorld world=new GameWorld();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("FrameDemo");
		
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(new GamePaneel());
		JFrame.setDefaultLookAndFeelDecorated(true);
		
	}

}
