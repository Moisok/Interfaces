package AlienExtermination;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class musica_y_sonidos {
	//Funcion para reproducir sonidos
			public void musica_y_sonidos(String audio){
			       try {
			        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(audio).getAbsoluteFile());
			        Clip clip = AudioSystem.getClip();
			        clip.open(audioInputStream);
			        clip.start();
			       } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
			         System.out.println("Error al reproducir el sonido.");
			       }
			     }

}
