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
    private Boolean bool = true;

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
/**
 * 
 * @return this will return the entire text file as a string
 */
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
     * @param write is the text that you want to be added to the text file
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
/**
 * 
 * @param e pass in any Event object and it will be stored in the text document in the correct format
 */
    void write(Event e) {
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f, this.bool));
            wrtr.write("name:->" + e.getName() + "exit@"
                    + "\nLoc:->" + e.getLocation() + "exit@"
                    + "\nM:->" + String.valueOf(e.getMonth()) + "exit@"
                    + "\nD:->" + String.valueOf(e.getDay()) + "exit@"
                    + "\nY:->" + String.valueOf(e.getYear()) + "exit@" + "\n");
            wrtr.close();
        } catch (Exception ex) {
            popup("Writing error");
        }
    }
/**
 * 
 * @param pop is the string that will show up in a pop up window when the method is called
 */
    void popup(String pop) {
        JFrame frame = new JFrame("");
        JOptionPane.showMessageDialog(frame, pop);
    }
/**
 * 
 * @param b set the write function to either append on the end of the text doc or rewrite the whole thing
 */
    void append(Boolean b) {
        this.bool = b;
    }
}
