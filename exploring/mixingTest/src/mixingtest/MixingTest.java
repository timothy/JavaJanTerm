/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixingtest;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
//import javax.sound.sampled.Mixer.Info;

/**
 *
 * @author tbrad_000
 */
public class MixingTest {

//    static Mixer getMixerByName(String toFind) {
//    for(Mixer.Info info : AudioSystem.getMixerInfo()) {
//        if(toFind.equals(info.getName())) {
//            return AudioSystem.getMixer(info);
//        }
//    }
//    return null;
//}
    
    static void printAllMixerNames() {
        for (Mixer.Info info : AudioSystem.getMixerInfo()) {
            System.out.println(info.getName());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mixer.Info[] getMixerInfo();


    }
}
//https://docs.oracle.com/javase/8/docs/api/javax/sound/sampled/AudioSystem.html#getMixer-javax.sound.sampled.Mixer.Info-
//https://docs.oracle.com/javase/8/docs/api/javax/sound/sampled/AudioSystem.html#getMixer-javax.sound.sampled.Mixer.Info-