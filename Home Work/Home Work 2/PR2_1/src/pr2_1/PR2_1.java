/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_1;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author tbradford16
 */
public class PR2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Gerbil> list = new ArrayList<>();
        Random r = new Random();
        //r.nextInt(1000);
        //Gerbil g1 = new Gerbil(1);
        for(int i = 0; i < 50; i++) {
            list.add(new Gerbil(r.nextInt(1000)));
        }
        for(int i = 0; i < 50; i++) {
            list.get(i).hop();
        }
    }

}
