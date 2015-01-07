/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_3;

import java.util.HashMap;
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
       HashMap<String,Gerbil> map = new HashMap<String,Gerbil>();
       
       map.put("Mikey", new Gerbil(445874));
       map.put("Brennan", new Gerbil(123456789));
      // map.get("Mikey").hop();
       
       Set<String> keys = map.keySet();
       
       for(String key:keys){
       map.get(key).hop();
       
       }
    }
    
}
