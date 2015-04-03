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
    private ArrayList<Double> list = new ArrayList();
    private HashMap<String, Double> map = new HashMap<String, Double>();
    //PT - Why do you need this?
    private Set<String> keys;
    private String name;
/**
 * 
 * @param name This is the students name and the name used for the HashMap so it can be used as a key as well
 */
    public HWT(String name) {
        this.map.put("Example CS171 ", 0.0);
        this.keys = map.keySet();
        this.calc = new Calculations();
        this.name = name;
    }
/**
 * 
 * @param name This is the students name and the name used for the HashMap so it can be used as a key as well
 * @param course this is the course that the grade is based on
 * @param d this is the grade of the student in this course
 */
    public HWT(String name, String course, double d) {
        this.map.put(course, d);
        this.keys = map.keySet();
        this.calc = new Calculations();
        this.name = name;
    }
/**
 * 
 * @return students name
 */
    public String getName() {
        return this.name;
    }
/**
 * 
 * @param N sets the students name to N
 */
    public void setName(String N) {
        this.name = N;
    }
/**
 * 
 * @param course the course is the Key to a HashMap that contains the home work score
 * @param HW_score This is the Home work score and is added to a HashMap. the key is the course of this score
 */
    public void add(String course, double HW_score) {
        this.map.put(course, HW_score);
    }
/**
 * 
 * @return an Array list that contain all the courses scores
 */
    public ArrayList<Double> getScoresList() {
        for (String key : this.keys) {
            this.list.add(this.map.get(key));
        }
        return this.list;
    }
/**
 * 
 * @return returns a String of all the scores
 */
    public String PrintScoresList() {
        String list = "";
        for (String key : this.keys) {
            list += key + " ";
            list += this.map.get(key) + "\n";
        }
        return list;
    }
/**
 * 
 * @param course takes a course and returns the score for that course
 * @return returns the score of the course it is given
 */
    public double getScore(String course) {
        return this.map.get(course);
    }
/**
 * 
 * @param course takes a course and returns the score in string format for that course
 * @return returns the score in string format of the course it is given
 */
    public String getScoreS(String course) {
        return String.valueOf(this.map.get(course));
    }

    public String avgS() {
        return String.valueOf(this.calc.avg(getScoresList()));
    }

    public String minS() {
        return String.valueOf(this.calc.min(getScoresList()));
    }

    public String maxS() {
        return String.valueOf(this.calc.max(getScoresList()));
    }

    public double avg() {
        return this.calc.avg(getScoresList());
    }

    public double min() {
        return this.calc.min(getScoresList());
    }

    public double max() {
        return this.calc.max(getScoresList());
    }
    /**
     * 
     * @return this will return the string of the students Name, Course, Grade, Min, Max, and Avg scores.
     */
    public String printToScreen(){    
        return "Student Name:" + name + "\nCourse Grades:" + 
                PrintScoresList() +"\nMin score:" + minS() +"\nMax score:" + maxS()
                +"\nAvg score:" + avgS();
    }

}
