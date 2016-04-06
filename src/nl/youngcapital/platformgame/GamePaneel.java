package nl.youngcapital.platformgame;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePaneel extends JPanel{

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.pink);
		g.fillRect(0,0,50,50);
		
	}
}
