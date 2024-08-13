import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public interface SoundInterface {
	 public default void audio() {
         try {
             File file = new File("res/Audio/pesma.wav");
             Clip clip = AudioSystem.getClip();
             clip.open(AudioSystem.getAudioInputStream(file));
             clip.loop(Clip.LOOP_CONTINUOUSLY);
             clip.start();
         } catch (Exception e) {
             System.err.println("Put the music.wav file in the sound folder if you want to play background music, only optional!");
         }
     }
	 
}
