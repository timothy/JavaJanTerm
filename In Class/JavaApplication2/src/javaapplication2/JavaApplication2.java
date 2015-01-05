/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.util.Scanner;
/**
 *
 * @author tbradford16
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tim = "Timothy";
        double num = 42.11536;
        System.out.printf("I Am %s !!!! numbers = %d \n", tim, (int)num);
        
        num = (54-665)+(54*15)/12;
        
        System.out.printf("Math!! %d\n",(int)num);
        
        Scanner input = new Scanner(System.in);
                
        int score = input.nextInt();
        
         System.out.printf(" Your score is this %d \n", score);
    }
    
}
