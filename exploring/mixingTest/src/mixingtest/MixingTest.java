/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixingtest;

import java.util.Vector;
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
        try {
            for (Mixer.Info info : AudioSystem.getMixerInfo()) {
                System.out.println(info.getName());
            }
        } catch (SecurityException s) {
            System.out.println("the requested mixer is unavailable because of security restrictions");
        } catch (IllegalArgumentException ill) {
            System.out.println("the info object does not represent a mixer installed on the system");
        }
    }
    
    Vector<Mixer.Info> v = new Vector();
    
        public Vector<Mixer.Info> printAllMixerNamesToVector() {
            String s = "";
        try {
            for (Mixer.Info info : AudioSystem.getMixerInfo()) {
                v.add(info);
                s += info.getName() + "\n";
            }
            return v;
        } catch (SecurityException se) {
            System.out.println("the requested mixer is unavailable because of security restrictions");
        } catch (IllegalArgumentException ill) {
            System.out.println("the info object does not represent a mixer installed on the system");
        }
        return v;
    }

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        printAllMixerNames();

       
     
       
        
        
        
        
    }
}
//https://docs.oracle.com/javase/8/docs/api/javax/sound/sampled/AudioSystem.html#getMixer-javax.sound.sampled.Mixer.Info-
//https://docs.oracle.com/javase/8/docs/api/javax/sound/sampled/AudioSystem.html#getMixer-javax.sound.sampled.Mixer.Info-
