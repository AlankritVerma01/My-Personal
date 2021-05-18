/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : Musician.java
 * Purpose : 
 * Comments : 
 */
package Part9.performer;

/**
 * Musician
 */
public class Musician extends Performer {
    private String instrument;
    
    public Musician(){
        super();
        instrument = "Piano";
    }

    public Musician(String inst){
        super();
        instrument =inst;
    }

    public Musician(String n, int a, String inst){
        super(n, a); // First line of the construnctor body
        instrument = inst; 
    }
}