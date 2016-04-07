package nl.youngcapital.platformgame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePaneel extends JPanel{
	int x;
	Tileset[] gameworld;
	GamePaneel(int x,Tileset[] world) {
		this.x=x;
		this.gameworld=world;
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
	//	Tileset[] gameworld=Test.world.getGameWorld();
	//	GameWorld bla=Test.world;
	//	Tileset[] gameworld=world.
		
		int rectsize=25;
	//	System.out.println("bla");
		
		for(int i=0;i<16;i++) {
		//	System.out.println(gameworld[i].set);
			for (int j=0;j<3;j++) {
			
				for (int k=0;k<3;k++) {
				//	System.out.println(gameworld[i].getSet()[j][k].type);
					if (gameworld[i].getSet()[j][k].type.equals("solid")) {
						
					//	System.out.println("solid");
						if (gameworld[i].set==0) {
						g.setColor(Color.BLACK);
						g.fillRect((3*i+k)*rectsize, (getHeight()-rectsize*(j+1)), rectsize, rectsize);
						}
						else if(gameworld[i].set==1) {
							g.setColor(Color.RED);
							g.fillRect((3*i+k)*rectsize, (getHeight()-rectsize*(j+1)), rectsize, rectsize);
							}
							
						else {
							g.setColor(Color.GREEN);
							g.fillRect((3*i+k)*rectsize, (getHeight()-rectsize*(j+1)), rectsize, rectsize);
							}
							
						
						
					}
					else {
						//System.out.println("empty");
					//	g.setColor(Color.GREEN);
					//	g.fillRect((3*i+k)*rectsize, (getHeight()-rectsize*(j+1)), rectsize, rectsize);
						
					}
				}
			}
		}
	
	
		
	}
}
