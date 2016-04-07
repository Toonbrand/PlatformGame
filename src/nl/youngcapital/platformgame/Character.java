package nl.youngcapital.platformgame;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Character extends JPanel {
	
	int posX = 0;
	int posY = 0;
	

	public static void main(String[] args) {

		ImageIcon person = new ImageIcon("/Sprites/pikachu.png");
		JLabel label = new JLabel("", person, JLabel.CENTER);
		JPanel panel = new JPanel(new BorderLayout());
		panel.add( label, BorderLayout.CENTER );
		
	}

}
