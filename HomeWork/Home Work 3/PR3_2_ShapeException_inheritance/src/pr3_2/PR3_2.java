/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_2;

import java.util.Scanner;

/**
 *
 * @author tbradford16
 */
public class PR3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ellipse eGood = new Ellipse(51, 65);
        Rectangle rGood = new Rectangle(34, 34);
        Triangle tGood = new Triangle(22, 22, 23);

        Scanner input = new Scanner(System.in);

        System.out.println("Please input 1 if you want to test the Exceptions\n "
                + "or 2 if you want to test the functionality");

        int i = input.nextInt();

        if (i == 2) {
            System.out.printf("Area of Ellipse:%f\nPerimeter of Ellipse:%f\n"
                    + "Area of Rectangle:%f\nPerimeter of Rectangle:%f\n"
                    + "Area of Triangle:%f\nPerimeter of Triangle:%f\n",
                    eGood.getArea(), eGood.getPerimeter(), rGood.getArea(),
                    rGood.getPerimeter(), tGood.getArea(), tGood.getPerimeter());

        }
       else if (i == 1) {
            Ellipse eBad = new Ellipse(-51, 65);
            Rectangle rBad = new Rectangle(-34, 34);
            Triangle tBad = new Triangle(-2, 2, 3);
            Triangle tBad2 = new Triangle(1, 5, 1000);
        }
       else{
       System.out.println("You need to enter the number 1 or 2 in order to get valid results");
       }
    }

}
