/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author tbradford16
 */
public class Calculations {

//    public Calculations() {
//    }

    //PT -- if max, min, and average are static, then the user doesn't have to create a Calculations object
    //PT -- need javadoc. -2
    //PT -- if the parameter is List<Integer>, it can work with many objects, not just ArrayList
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
    // wanted to test out the iterator on avgD
    public double avgD(ArrayList<Double> l) {
        double sum = 0;
        
        for (Iterator<Double> it = l.iterator(); it.hasNext();) { 
            double d = it.next();
            sum += d;
        }
        
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
