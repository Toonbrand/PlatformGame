 
	
	import java.awt.image.BufferedImage;
	import java.io.File;
	import java.io.IOException;
	import javax.imageio.ImageIO;
	import javax.swing.*;

	public class LabelTest {
	    public static void main(String[] args) throws IOException {
	        String path = "Sprites/pikachu.png";
	        File file = new File(path);
	        BufferedImage image = ImageIO.read(file);
	        JLabel label = new JLabel(new ImageIcon(image));
	        JFrame f = new JFrame();
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f.getContentPane().add(label);
	        f.pack();
 
	        f.setVisible(true);
	    }
	}

