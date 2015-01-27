/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audiof;

import java.io.File;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.TargetDataLine;
import ddf.minim.*;


/**
 *
 * @author tbradford16
 */
public class AudioF {

    public static Mixer mixer;
    public static Clip clip;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Mixer.Info[] mixInfos = AudioSystem.getMixerInfo();
//
//        mixer = AudioSystem.getMixer(mixInfos[0]);
//
//        DataLine.Info dataInfo = new DataLine.Info(Clip.class, null);
//        try {
//            clip = (Clip) mixer.getLine(dataInfo);
//        } catch (LineUnavailableException lue) {
//            lue.printStackTrace();
//        }
//
//        try {
//            URL soundURL = AudioF.class.getResource("/audiof/test.wav");
//            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundURL);
//            clip.open(audioStream);
//
//        } catch (LineUnavailableException lue) {
//            lue.printStackTrace();
//        } catch (UnsupportedAudioFileException uafe) {
//            uafe.printStackTrace();
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//
//        clip.start();
//
//        do {
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException ie) {
//                ie.printStackTrace();
//            }
//        } while (clip.isActive());
 
    }
}
