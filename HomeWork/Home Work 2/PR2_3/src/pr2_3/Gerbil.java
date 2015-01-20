/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_3;

/**
 *
 * @author tbradford16
 */
public class Gerbil {

    private int gerbilNumber;

    public Gerbil(int gerbNum) {
        this.gerbilNumber = gerbNum;
    }

    public int get() {
        return this.gerbilNumber;
    }

    public void set(int gerbs) {
        this.gerbilNumber = gerbs;
    }

    public String toString() {
        return "This is Gerbil #" + this.gerbilNumber;
    }

    public void hop() {
        System.out.printf("This gerbal number is %d and it is hopping!\n", this.gerbilNumber);
    }
}
