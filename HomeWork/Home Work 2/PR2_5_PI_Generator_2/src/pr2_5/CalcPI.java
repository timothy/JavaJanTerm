/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_5;
//PT - again, import this from PR2_4
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
/**
 * 
 * @param n takes 
 */
    public void set(int n) {
        PI = 4;
        double three = 3;
        boolean minus = true;

        for (int i = 0; i < n; i++) {
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

    public double get() {
        return this.PI;
    }

    public String ToString() {
        return String.valueOf(get());
    }
}
