/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_2;

import java.util.*;

/**
 *
 * @author tbradford16
 */
public class PR2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List gerbs = new ArrayList();

        for (int i = 0; i < 7; i++) {
            gerbs.add(new Gerbil(i));
        }

        Iterator e = gerbs.iterator();

        while (e.hasNext()) {
            ((Gerbil) e.next()).hop();
        }
    }
}
