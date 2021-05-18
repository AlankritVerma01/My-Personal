/** Programmer : Alankrit Verma
 * Date created : Tue May 18 2021
 * File name : Comedian.java
 * Purpose : 
 * Comments : 
 */
package Part9.performer;

import java.util.ArrayList;
/**
 * Comedian
 */
public class Comedian extends Performer {
    
    private ArrayList<String> jokes;

    public Comedian(String n , int a){

    }
    public void writeJokes()
    {
    }

    public void perform() //Overwrite , not it will use this , not the super class variable
    {
        for(String joke:jokes)
        System.out.println(joke);
    }
}