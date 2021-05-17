/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : InsertionSort.java
 * Purpose : 
 * Comments : 
 */
package Part7;

/**
 * InsertionSort
 */
import j ava.util.ArrayList;
public class InsertionSort {

    public static void main(String[] args) {
        
        for(int outer =1 ; outer < randomList.size(); outer++)
        {
            DebugDuck tested = randomList.get(outer);
            int inner = outer -1 ; 
            
            while (inner >= 0 && tested.compareTo(randomList.get(inner))<0)
            {
                randomList.set(inner+1 , randomList.get(inner));
            }

            random.set(inner + 1 , tested);
        }
    }
}