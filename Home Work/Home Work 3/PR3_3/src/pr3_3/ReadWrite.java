/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tbradford16
 */
public class ReadWrite {

    private File f;

    ReadWrite() {
        f = new File("c:\\users\\pete\\documents\\mover.scr");
    }

    /**
     *
     * @param takes the file location
     */
    ReadWrite(String s) {
        f = new File(s);
    }

    String read() {
        String s = "";
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(this.f));
            String line;
            while ((line = rdr.readLine()) != null) {
                s += line;
                rdr.close();
            }
            return s;
        } catch (Exception ex) {
            popup("an error with reading the file happend");
        }
        return s;
    }

    /**
     *
     * @param texted to be stored
     */
    void write(String write) {
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
            wrtr.write(write);
            wrtr.close();
        } catch (Exception e) {
            popup("Writing error");
        }
    }

    void write(Event e) {
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f, true));
            wrtr.write("name:->" + e.getName() + "\nLoc:->" + e.getLocation()
                    + "\nM:->" + String.valueOf(e.getMonth()) + "\nD:->" + String.valueOf(e.getDate())
                    + "\nY:->" + String.valueOf(e.getYear()) + "\n");
            wrtr.close();
        } catch (Exception ex) {
            popup("Writing error");
        }
    }
    
    void popup(String pop) {
        JFrame frame = new JFrame("");
        JOptionPane.showMessageDialog(frame, pop);
    }
}
