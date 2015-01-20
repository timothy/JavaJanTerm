/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_4.area.of.a.circle;
import java.util.Scanner;
/**
 *
 * @author tbradford16
 */
public class PR1_4AreaOfACircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double PI = 3.14; //PT: use java.lang.Math.PI
        
        Scanner input = new Scanner(System.in);
        
         System.out.println(" Please give the radius of your circle\n");
        
        int radius = input.nextInt();
        
        double area = radius*radius * PI;
        
        System.out.printf("\nThe Area of this circle is %f \n", area);
        
        // TODO code application logic here
    }
    
}
