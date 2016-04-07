package nl.youngcapital.platformgame;

import javax.swing.JFrame;
public class Test{
	
	
	static int width=500;
	static int height=500;
	static final GameWorld world=new GameWorld();
	static Tileset[] getworld=world.getGameWorld();
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("FrameDemo");
		Character c = new Character(0,0);
		
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//for(int i=0;i<10;i++) {

		//frame.getContentPane().add(c.createCharacter());
		frame.add(new GamePaneel(100,getworld,c));
		
		frame.setVisible(true);
		
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		}



	}

