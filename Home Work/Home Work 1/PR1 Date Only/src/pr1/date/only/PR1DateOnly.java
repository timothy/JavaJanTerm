/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1.date.only;

/**
 *
 * @author tbradford16
 */
public class PR1DateOnly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//PT: we don't generally define classes inside a function. And mostly classes are defined in their own file.
class DataOnly {

            int i;
            float f;
            boolean b;
        }
    
    DataOnly d = new DataOnly();
    
        d.i = 47;
        d.f = 1.1f; // ‘f’ after number indicates float constant
        d.b = false;
        System.out.printf("PR1_1: Date Only\n");
        
        System.out.printf("int %d\nfloat %f\nboolean %b\n", d.i, d.f, d.b);
        // This one
    }
    
}
