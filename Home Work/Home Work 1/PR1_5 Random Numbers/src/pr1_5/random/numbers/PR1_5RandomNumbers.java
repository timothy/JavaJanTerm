/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_5.random.numbers;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author tbradford16
 */
public class PR1_5RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        Random randomGenerator = new Random();
        
       int checker = randomGenerator.nextInt(100);
       
    for(int i = 0; i < 25; i++){
        list.add(randomGenerator.nextInt(100));
    }
           
    System.out.printf("The second randomly-generated value is %d\n", checker);
    
        for(int i = 0; i < 25; i++){
            
       if(list.get(i) < checker){
       System.out.printf("Random number %d is less than the second randomly-generated value\n", i);
       }
       else if (list.get(i) > checker){
       System.out.printf("Random number %d is greater than the second randomly-generated value\n", i);
       }
           else if (list.get(i) == checker){
       System.out.printf("Random number %d is equal than the second randomly-generated value\n", i);
       }
            
    }
    
    

    } 
}
