/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixtest3;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;

/**
 *
 * @author tbradford16
 */
/**
 * @param args the command line arguments
 */
public class MixTest2 extends InputStream {

    private String fileLoc;
    private AudioClip audioFile;
    private String name;
    private String type;
    private Double length;
    private String location;
    private long frames;

    MixTest2() {
    }

    MixTest2(String s) {
        this.fileLoc = s;
        try {
            URL u = new URL("file:///" + s);
            this.audioFile = Applet.newAudioClip(u);
            this.location = s;
        } catch (Exception ex) {
            System.out.println("Ah crap...something went wrong in the audio inport" + ex.toString());
        }
    }

    public long getFrameLength() {
        File file = new File(this.fileLoc);
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            AudioFormat format = audioInputStream.getFormat();
            long frames = audioInputStream.getFrameLength();
            this.length = (frames + 0.0) / format.getFrameRate();
            frames = (new Double(length).longValue());
            return frames;
        } catch (Exception ex) {
            System.out.println("Ah crap...something went wrong with getting file length" + ex.toString());
            return this.frames;
        }
    }

    public String sLength() {
        return String.valueOf(getFrameLength());
    }

    public void AudioPlay() {
        this.audioFile.play();
    }

    public void AudioStop() {
        this.audioFile.stop();
    }

    public void setType(String t) {
        this.type = t;
    }

    public String getLocation() {
        return this.location;
    }

    @Override
    public int read() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
