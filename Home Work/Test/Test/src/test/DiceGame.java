/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tbradford16
 */
public class DiceGame {

    private double totalCash = 0;
    private double bet = 0;
    private double cash = 500;
    private int die1 = 0;
    private int die2 = 0;

    DiceGame() {
        
    }

    void roll() {
        Random randomGenerator = new Random();
        this.die1 = randomGenerator.nextInt(6) + 1;
        this.die2 = randomGenerator.nextInt(6) + 1;
    }

    int getDie1() {
        return this.die1;
    }

    int getDie2() {
        return this.die2;
    }

    Boolean diceOutcome(int i) {
        if (i == 1) {// over 7
            roll();
            return (this.die1 + this.die2 > 7);
        } else if (i == 0) {// is 7
            roll();
            return (this.die1 + this.die2 == 7);
        } else if (i == -1) {//under 7
            return (this.die1 + this.die2 < 7);
        } else {
            popup("There was an error in the \n diceOutcome() method");
            return false;
        }
    }

    void makeBet(int i) {
        if (diceOutcome(i) && i == 0) {
            this.totalCash += this.bet * 4;
        } else if (diceOutcome(i)) {
            this.totalCash += this.bet;
        } else if (!diceOutcome(i)) {
            this.totalCash = this.totalCash - this.bet;
        } else {
          //  popup("error in makeBet() method");
        }

    }

    void setBet(double b) {
        this.bet = b;
    }

    void setTotal(double t) {
        this.totalCash = t;
    }

    double getTotal() {
        return this.totalCash;
    }

    void popup(String pop) {
        JFrame frame = new JFrame("");
        JOptionPane.showMessageDialog(frame, pop);
    }

}
