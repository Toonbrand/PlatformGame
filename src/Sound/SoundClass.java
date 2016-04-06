package Sound;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class SoundClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String bip = "bip.mp3";
		Media hit = new Media(bip);
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();

	}

}
