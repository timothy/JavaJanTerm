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
//PT -- I know the table sorted for you, but I needed you to use the comparator
//     class that we talked about. -5
//PT -- duplicate events?
public class Event {

    private String name;
    private String location;
    private int month;
    private int day;
    private int year;

    Event() {
    }
/**
 * 
 * @param n The name of the event
 * @param l The location of the event
 * @param m The month of the event. this string will be parsed into an integer
 * @param d the Day of the event. this string will be parsed into an integer
 * @param y  the year of the event. this string will be parsed into an integer
 */
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
/**
 * 
 * @return returns the Name
 */
    String getName() {
        return this.name;
    }
/**
 * 
 * @return returns the Location
 */
    String getLocation() {
        return this.location;
    }
/**
 * 
 * @return returns the Month
 */
    int getMonth() {
        return this.month;
    }
/**
 * 
 * @return returns the Day
 */
    int getDay() {
        return this.day;
    }
/**
 * 
 * @return returns the Year
 */
    int getYear() {
        return this.year;
    }
/**
 * 
 * @param s sets the Name
 */
    void setName(String s) {
        this.name = s;
    }
/**
 * 
 * @param s sets the Location
 */
    void setLocation(String s) {
        this.location = s;
    }
/**
 * 
 * @param s sets the Month
 */
    void setMonth(int s) {
        this.month = s;
    }
/**
 * 
 * @param i sets the day
 */
    void setDay(int i) {
        this.day = i;
    }
/**
 * 
 * @param i sets the Year
 */
    void setYear(int i) {
        this.year = i;
    }

}
