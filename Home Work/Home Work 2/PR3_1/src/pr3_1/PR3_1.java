/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.*;
/**
 *
 * @author tbradford16
 */
public class PR3_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Calculations calc = new Calculations();

        System.out.println("Please enter ten numbers");
        for (int i = 0; i < 10; i++) {
            try {
                list.add(new Scanner(System.in).nextInt());
            } catch (InputMismatchException ex1) {
                System.out.println("Please only input integer numbers: %s");
                i--;
                continue;
            }
        }
        System.out.printf("Min:%d\nMax:%d\nAvg:%d\n", calc.minI(list), calc.maxI(list), calc.avgI(list));
    }
}
