



package nl.youngcapital.platformgame;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.*;

public class Character extends JPanel{
	
	int posX;
	int posY;


	
	
	Character(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	public void createCharacter(Graphics g) {
		
		int rectsize=100;
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g);		
		String path = "Sprites/pikachu.png";
		File file = new File(path);
		BufferedImage image;
		try {
			image = ImageIO.read(file);
			int size = 50;
			g2.drawImage(image, posX, getHeight() - 200 - size - posY  , size, size, this); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*public JLabel createCharacter() throws IOException
	{
		String path = "Sprites/pikachu.png";
	    File file = new File(path);
	    BufferedImage image = ImageIO.read(file);
	    JLabel label = new JLabel(new ImageIcon(image));
		return label;
	
	}*/
	
	public void move(int direction){
		posX += direction;
		repaint();
	}

}

