/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_6.prime.numbers;

import java.util.Scanner;

/**
 *
 * @author tbradford16
 */
public class PR1_6PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println(" Prime Number Checker\n This will find all prime"
                + " numbers less than the number entered\n");

        int prime = input.nextInt();
        boolean yes = true;

        // I do not need to divide any number higher than half of the number given to find the answere
        //int count = prime / 2;

        //982,451,653 is a prime number used for testing
        for (int n = 1; n <= prime; n++) {
            if (n > 3) {
                for (int i = 2; i < n/2 ; i++) {

                    if (n % i == 0) {
                       // System.out.println(" This number is not a prime number");
                        yes = false;
                        break;
                    }
                }
            }
            
           if (yes == true) {
                System.out.printf("Prime %d \n", n);
            }
           yes = true;
        }

    }

}
