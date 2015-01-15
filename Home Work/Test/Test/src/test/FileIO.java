/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

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
public class FileIO {

    private File f;
    private Boolean bool = true;
   // private Login log = new Login();

    /**
     *
     * @see default file location
     */
    FileIO() {
        f = new File("C:\\Users\\tbradford16\\Desktop\\tim.txt");
    }

    /**
     *
     * @param takes the file location
     */
    FileIO(String s) {
        f = new File(s);

    }

    void setFileLocation(String s) {
        f = new File(s);
    }
/**
 * 
 * @param name takes the user name if an error happens than it assumes there is no user by that name and returns a new user
 * @return a string with the entire text file in it
 */
    String read(String name) {
        String s = "";
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(this.f));
            String line;
            while ((line = rdr.readLine()) != null) {
                s += line;
            }
            rdr.close();
            return s;
        } catch (Exception ex) {
            write("Login->" + name + "500?\">");
           return "Login->" + name + "500?\">";
            
        }
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
/**
 * 
 * @param pop the message you want to be displayed
 */
    void popup(String pop) {
        JFrame frame = new JFrame("");
        JOptionPane.showMessageDialog(frame, pop);
    }
/**
 * 
 * @param b changes the write method to either over write text doc or append to it
 */
    void append(Boolean b) {
        this.bool = b;
    }
}
