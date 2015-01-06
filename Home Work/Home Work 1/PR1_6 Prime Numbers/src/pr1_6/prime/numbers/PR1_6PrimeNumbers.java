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

        System.out.println(" Prime Number Checker\n Plesea enter a number to be checked");

        int prime = input.nextInt();
        boolean yes = true;

        // I do not need to divide any number higher than half of the number given to find the answere
        int count = prime / 2;

        //982,451,653 is a prime number used for testing
        if (prime > 3) {
            for (int i = 2; i < count; i++) {

                if (prime % i == 0 && i != 1 && i != prime) {
                    System.out.println(" This number is not a prime number");
                    yes = false;
                    break;
                }
            }
        }
        if (yes == true) {
            System.out.println(" You gave me a prime number");
        }

    }

}
