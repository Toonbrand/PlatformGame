package nl.youngcapital.platformgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePaneel extends JPanel implements KeyListener{
	int x;
	Tileset[] gameworld;
	Character c;

	GamePaneel(int x,Tileset[] world, Character c) {
		this.x=x;
		this.c=c;
		this.gameworld=world;


		addKeyListener(this);
		setFocusable(true);
		requestFocus();

	}
	
	AffineTransform transform = new AffineTransform(); 
	String path = "Sprites/pikachu.png";
	BufferedImage image;

	public void paintComponent(Graphics g) {
	     
		super.paintComponent(g);		
<<<<<<< HEAD
		
		
		Graphics2D g2 = (Graphics2D) g;
		int rectsize=100;
=======

		String path = "Sprites/pikachu.png";
>>>>>>> branch 'master' of https://github.com/Toonbrand/PlatformGame.git
		File file = new File(path);
<<<<<<< HEAD
		
=======
		BufferedImage image;

>>>>>>> branch 'master' of https://github.com/Toonbrand/PlatformGame.git
		try {
			image = ImageIO.read(file);
			int size = 50;

			g2.drawImage(image, c.posX, getHeight() - 200 - size - c.posY  , size, size, this); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//	Tileset[] gameworld=Test.world.getGameWorld();
		//	GameWorld bla=Test.world;
		//	Tileset[] gameworld=world.


		//	System.out.println("bla");
		System.out.println(x);
		
		for(int i=0;i<gameworld.length;i++) {
			for (int j=0;j<3;j++) {

				for (int k=0;k<3;k++) {
//						System.out.println(gameworld[i].getSet()[j][k].type);
					if (gameworld[i].getSet()[j][k].type.equals("solid")) {

						//	System.out.println("solid");
						if (gameworld[i].set==0) {
							g.setColor(Color.BLACK);
							g.fillRect(((3*(i)+k)*rectsize)+x, (getHeight()-rectsize*(j+1)), rectsize, rectsize);
//							g.fillRect((3*(i-x/300)+k)*rectsize, (getHeight()-rectsize*(j+1)), rectsize, rectsize);
						}
						else if(gameworld[i].set==1) {
							g.setColor(Color.RED);
							g.fillRect(((3*(i)+k)*rectsize)+x, (getHeight()-rectsize*(j+1)), rectsize, rectsize);
//							g.fillRect((3*(i-x/300)+k)*rectsize, (getHeight()-rectsize*(j+1)), rectsize, rectsize);
						}

						else {
							g.setColor(Color.GREEN);
							g.fillRect(((3*(i)+k)*rectsize)+x, (getHeight()-rectsize*(j+1)), rectsize, rectsize);
//							g.fillRect((3*(i-x/300)+k)*rectsize, (getHeight()-rectsize*(j+1)), rectsize, rectsize);
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



	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch( keyCode ){
			case KeyEvent.VK_RIGHT : x = x - 10;
			System.out.println(x);
			break;
			case KeyEvent.VK_LEFT : {x = x + 10;
			
		    transform.setToTranslation(-1, -1);
             
		    transform.scale(-1, 1);
            transform.translate(- image.getWidth(), 0);
            Graphics2D g2 = (Graphics2D) g;
            g.drawImage(image,transform,null); 
			}
		}
		repaint();
	}


	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
}
