
package problemsolve;

import java.util.ArrayList;
import java.util.Collections;

public class RandomNumber {
        
public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<11; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i=0; i<10; i++) {
            System.out.println(list.get(i));
        }

//        Random rand = new Random();
//        int maxNumber = 100;
//
//        int randomNumber = rand.nextInt(maxNumber) + 1;
//
//        System.out.println(randomNumber);
    }
}
