/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_6;

import java.util.ArrayList;
//import java.util.Collections;

/**
 *
 * @author tbradford16
 */
public class Calculations {

//    public Calculations() {
//    }
/**
 * 
 * @param l this is a list of scores
 * @return the min out of the list it is given
 */
    public double min(ArrayList<Double> l) {
        double min = Double.MAX_VALUE;
        for (double d : l) 
            if(min > d) min = d;
        
        return min;
    }
/**
 * 
 * @param l this is a list of scores
 * @return returns the average of the list of doubles it was given
 */
    public double avg(ArrayList<Double> l) {
        double sum = 0;
        
        for (double d : l) 
            sum += d;
        
        return (Double) (sum / l.size());
    }
/**
 * 
 * @param l a list of course scores
 * @return returns the max score out of the list of scores
 */
    public double max(ArrayList<Double> l) {
                double max = -1;
        for (double d : l) 
            if(max < d) max = d;
        
        return max;
       
    }
}
