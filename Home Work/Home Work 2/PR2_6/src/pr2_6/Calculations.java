/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_6;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author tbradford16
 */
public class Calculations {

//    public Calculations() {
//    }

    public double min(ArrayList<Double> l) {
        return l.indexOf(Collections.min(l));
    }

    public double avg(ArrayList<Double> l) {
        double sum = 0;

        for (double d : l) {
            sum += d;
        }
        return (Double) (sum / l.size());
    }

    public double max(ArrayList<Double> l) {
        return l.indexOf(Collections.max(l));
    }
}
