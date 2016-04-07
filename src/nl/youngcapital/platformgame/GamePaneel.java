package nl.youngcapital.platformgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePaneel extends JPanel{
	int x;
	Tileset[] gameworld;
	Character c;
	GamePaneel(int x,Tileset[] world, Character c) {
		this.x=x;
		this.gameworld=world;
		this.c=c;
	}
	
	
	
	public void paintComponent(Graphics g) {
		
		int rectsize=100;
		Graphics2D g2 = (Graphics2D) g;
		
		super.paintComponent(g);		
		String path = c.path;
	    File file = new File(path);
	    BufferedImage image;
		try {
			image = ImageIO.read(file);
			int size = 50;
			g2.drawImage(image, c.posX-size/2, getHeight() - size - c.posY  , size, size, this); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		
	//	Tileset[] gameworld=Test.world.getGameWorld();
	//	GameWorld bla=Test.world;
	//	Tileset[] gameworld=world.
		

	//	System.out.println("bla");
		
		for(int i=0;i<gameworld.length;i++) {
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
