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
public class PR2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Need to check that args.length > 0. -2
       CalcPI PI = new CalcPI(Integer.parseInt(args[0]));
        
        //CalcPI PI = new CalcPI(50000000);
        
        System.out.printf("%.17g%n \n", PI.get());
        
    }
    
}
