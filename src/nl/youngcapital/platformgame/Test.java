package nl.youngcapital.platformgame;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.Timer;
public class Test {
	
	
	static int width=1000;
	static int height=1000;
	static final GameWorld world=new GameWorld();
	static Tileset[] getworld=world.getGameWorld();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("FrameDemo");
		
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//for(int i=0;i<10;i++) {
			
		//Timer timer = new Timer(100, e);
		
		frame.add(new GamePaneel(100,getworld));
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		}
	}

}
