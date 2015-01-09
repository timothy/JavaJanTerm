/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author tbradford16
 */
public class PR2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Gerbil> map = new HashMap<String, Gerbil>();

  //      Iterator<String> e = map.keySet().iterator();

        map.put("Mikey", new Gerbil(445874));
        map.put("Brennan", new Gerbil(123456789));
        map.put("Kyle", new Gerbil(42));
        map.put("Tim", new Gerbil(1));

        // map.get("Mikey").hop();
        // Iterator starts here!!!
        Set<String> keys = map.keySet();

        for (String key : keys) {
            map.get(key).hop();
        }
//        while (e.hasNext()) {
//            ((Gerbil) map.get(e.next())).hop();
//        }
    }

}
