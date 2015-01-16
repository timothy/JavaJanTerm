/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreviewer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
// include name, address, the user’s notes, and a 5-star rating.

/**
 *
 * @author tbradford16
 */
public class FileSaver {

    private Pattern p;
    private File f;
    private boolean bool = true;

    FileSaver() {
        f = new File("myfile");
    }

    void saver(Reviewer r) {
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f, this.bool));

            wrtr.write("Restaurant's Name:" + r.getName());
            wrtr.write("Address:" + r.getAddress());
            wrtr.write("My Notes:" + r.getNotes());
            wrtr.write("My Rating:" + r.getRating());
            wrtr.newLine();
            wrtr.close();
        } catch (Exception ex) {
            popup("Writing error");
        }
    }

    String reader() {
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
            popup("an error with reading the file happend\n" + ex.toString());
        }
        return s;
    }

    void append(Boolean b) {
        this.bool = b;
    }

    void popup(String pop) {
        JFrame frame = new JFrame("");
        JOptionPane.showMessageDialog(frame, pop);
    }
}
