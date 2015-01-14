/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_3;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tbradford16
 */
public class Event {

    private String name;
    private String location;
    private int month;
    private int day;
    private int year;

    Event() {
    }

    Event(String n, String l, String m, String d, String y) {
        this.name = n;
        this.location = l;
        try {
            this.month = Integer.parseInt(m);
            this.day = Integer.parseInt(d);
            this.year = Integer.parseInt(y);
        } catch (Exception e) {
            JFrame frame = new JFrame("");
            JOptionPane.showMessageDialog(frame, "Make sure you have valid inputs in all fields."
                    + " i.e. In Months input 1 instead of January; ");
            this.month = 0;
            this.day = 0;
            this.year = 0;
        }
    }

    String getName() {
        return this.name;
    }

    String getLocation() {
        return this.location;
    }

    int getMonth() {
        return this.month;
    }

    int getDate() {
        return this.day;
    }

    int getYear() {
        return this.year;
    }

    void setName(String s) {
        this.name = s;
    }

    void setLocation(String s) {
        this.location = s;
    }

    void setMonth(int s) {
        this.month = s;
    }

    void setDate(int i) {
        this.day = i;
    }

    void setYear(int i) {
        this.year = i;
    }

}
