/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_4;

import java.text.DecimalFormat;

/**
 *
 * @author tbradford16
 */
public class CalcPI {

    private double PI;

    CalcPI() {
        set(200000);
    }

    CalcPI(int n) {
        set(n);
    }

    //PT - need javadocs for functions. -2
    public void set(int n) {
        PI = 4;
        double three = 3;
        boolean minus = true;

        for (int i = 0; i < n; i++) {
            //PT - could you get rid of the if/else?
            //   hint: -1^n is 1 if n is even, -1 if n is odd
            //TB - if I do the sugestions it will slow the program down because it will have to always raise -1 to the power of n
            if (minus) {
                this.PI -= (4 / three);
                minus = false;
            } else {
                this.PI += (4 / three);
                minus = true;
            }
            three += 2;
        }
    }

    public void printSeries(int n) {
        for (int i = 0; i < n; i++) {

            set(i);

            System.out.println(ToString());
        }

    }

    public double get() {
        return this.PI;
    }

    public String ToString() {
        return String.valueOf(get());
    }

}
