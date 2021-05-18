/** Programmer : Alankrit Verma
 * Date created : Tue May 18 2021
 * File name : Hat.java
 * Purpose : 
 * Comments : 
 */
package FRQs.hat;

/**
 * Hat
 */
public class Hat {

    private int size; // in centimeter
    private String material;
    
    public Hat(int s, String m)
    {
        size = s;
        material = m ; 
    }
    
    public boolean equals(Object other){
        if(!(other instanceof Hat))
        {
            return false;
        }
        Hat h = (Hat)other;
        return this.size == h.size && this.material.equals(h.material);
    }        
}