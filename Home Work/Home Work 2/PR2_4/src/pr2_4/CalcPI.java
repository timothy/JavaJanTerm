/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_4;

/**
 *
 * @author tbradford16
 */
public class CalcPI {

    private double PI;

    CalcPI() {
        PI = 4;
        int three = 3;
        boolean minus = true;

        for (int i = 0; i < 200000; i++) {
            if (minus) {
                this.PI -= (4 / three);
                minus = true;
            } else {
                this.PI += (4 / three);
                minus = false;
            }
            three += 2;
        }
    }

    CalcPI(int n) {
        PI = 4;
        int three = 3;
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

}