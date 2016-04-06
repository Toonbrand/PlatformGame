package Sound;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;



public class SoundClass {

	public static void main(String[] args) {
		JFXPanel fxPanel = new JFXPanel();

		SoundClass s = new SoundClass();
		
		String bip = s.getClass().getResource("/Sound/Nyan.mp3").toString();
		System.out.println(bip);
		Media hit = new Media(bip);
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
		
	}
}

