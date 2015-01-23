/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mixtest3;
import java.util.ArrayList;

/**
 *
 * @author tbradford16
 */
public class MixTest3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MixTest2 m = new MixTest2("C:\\Users\\tbradford16\\Desktop\\JavaJanTerm\\exploring\\MixTest3\\src\\mixtest3\\test.wav");
        MixTest2 m2 = new MixTest2("C:\\Users\\tbradford16\\Desktop\\JavaJanTerm\\exploring\\MixTest3\\src\\mixtest3\\test2.wav");
        ArrayList List = new ArrayList();
        List.add(m);
        List.add(m2);
        
        
        
        m.AudioPlay();
        
    }
    
}
