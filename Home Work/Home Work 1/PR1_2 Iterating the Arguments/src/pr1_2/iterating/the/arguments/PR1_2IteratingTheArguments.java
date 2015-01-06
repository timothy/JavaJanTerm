/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_2.iterating.the.arguments;

/**
 *
 * @author tbradford16
 */
public class PR1_2IteratingTheArguments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        foo(args);
        // TODO code application logic here
    }
 
    /**
     * I have now completed PR_2 and PR_3
     */
    public static void foo(String[] args) {
        // Do something here
        System.out.printf("%s likes to go to the %s and have a %s", args[0], args[1], args[2]);
    }
}
