/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author tbradford16
 */
public class Calculations {

//    public Calculations() {
//    }

    public int minI(ArrayList<Integer> l) {
        int min = Integer.MAX_VALUE;
        for (int d : l) 
            if(min > d) min = d;
        
        return min;
    }
    
    public double minD(ArrayList<Double> l) {
        double min = Double.MAX_VALUE;
        for (double d : l) 
            if(min > d) min = d;
        
        return min;
    }

        public int avgI(ArrayList<Integer> l) {
        double sum = 0;
        
        for (int d : l) 
            sum += d;
        
        return (int) (sum / l.size());
    }
    
    public double avgD(ArrayList<Double> l) {
        double sum = 0;
        
        for (double d : l) 
            sum += d;
        
        return (Double) (sum / l.size());
    }
    
        public int maxI(ArrayList<Integer> l) {
                int max = -1;
        for (int d : l) 
            if(max < d) max = d;
        
        return max;
       
    }
        
    public double maxD(ArrayList<Double> l) {
                double max = -1;
        for (double d : l) 
            if(max < d) max = d;
        
        return max;
       
    }
}
