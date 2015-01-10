/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//PR2_6: Homework Tracker
//Design a user interface that allows someone to enter homework scores one at a time, and displays a 
//running min(), max(), and average(). The scores should be stored in a collection (e.g. List or Map), 
//and calculations should be performed in a separate class.
package pr2_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 *
 * @author tbradford16
 */
public class HWT {

    private Calculations calc;
    private ArrayList list = new ArrayList();
    private HashMap<String, Double> map = new HashMap<String, Double>();
    private Set<String> keys;
    private String name;

    public HWT() {
        this.map.put("", 4.0);
        keys = map.keySet();
        calc = new Calculations();
        name = "";
    }

    public HWT(String name, String course, double d) {
        this.map.put(course, d);
        keys = map.keySet();
        calc = new Calculations();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String N) {
        this.name = N;
    }

    public void add(String course, double HW_score) {
        map.put(course, HW_score);
    }

    public ArrayList<Double> getScoresList() {
        for (String key : keys) {
            list.add(map.get(key));
        }
        return list;
    }

    public String PrintScoresList() {
        String list = "";
        for (String key : keys) {
            list += key + " ";
            list += map.get(key) + "\n";
        }
        return list;
    }

    public double getScore(String course) {
        return map.get(course);
    }

    public String getScoreS(String course) {
        return String.valueOf(map.get(course));
    }

    public String avgS() {
        return String.valueOf(calc.avg(getScoresList()));
    }

    public String minS() {
        return String.valueOf(calc.min(getScoresList()));
    }

    public String maxS() {
        return String.valueOf(calc.max(getScoresList()));
    }

    public double avg() {
        return calc.avg(getScoresList());
    }

    public double min() {
        return calc.min(getScoresList());
    }

    public double max() {
        return calc.max(getScoresList());
    }
    
    public String printToScreen(){    
        return "Student Name:" + name + "\nCourse Grades:" + 
                PrintScoresList() +"\nMin score:" + minS() +"\nMax score:" + maxS()
                +"\nAvg score:" + avgS();
    }

}
