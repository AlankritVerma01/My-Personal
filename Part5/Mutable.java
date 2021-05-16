/** Programmer : Alankrit Verma
 * Date created : Sat May 15 2021
 * File name : Mutable.java
 * Purpose : 
 * Comments : 
 */
package Part5;
/**
 * Mutable
 */
public class Mutable {
    private int value;
    public Mutable (int start){
        value = start;
    }

    public void incrementValue(){
        value++;
    }

    public int getValue(){
        return value;
    }
    
}