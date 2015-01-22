/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancatenater;

import java.awt.List;
import java.io.File;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;
import java.io.IOException;
import java.io.SequenceInputStream;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

/**
 *
 * @author tbradford16
 */
public class Cancatenater {

    Cancatenater() {
    }

       public void wavCombine(String wavFile1,String wavFile2) {
	   // String wavFile1 = "D:\\wav1.wav";
	   // String wavFile2 = "D:\\wav2.wav";

	    try {
		    AudioInputStream clip1 = AudioSystem.getAudioInputStream(new File(wavFile1));
		    AudioInputStream clip2 = AudioSystem.getAudioInputStream(new File(wavFile2));

		    AudioInputStream appendedFiles = 
                            new AudioInputStream(
                                new SequenceInputStream(clip1, clip2),     
                                clip1.getFormat(), 
                                clip1.getFrameLength() + clip2.getFrameLength());

		    AudioSystem.write(appendedFiles, 
                            AudioFileFormat.Type.WAVE, 
                            new File("wavAppended.wav"));
	    } catch (Exception e) {
		    e.printStackTrace();
	    }
    }

}
