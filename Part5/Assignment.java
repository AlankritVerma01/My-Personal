/** Programmer : Alankrit Verma
 * Date created : Sat May 15 2021
 * File name : Assignment.java
 * Purpose : 
 * Comments : 
 */
package Part5;

/**
 * Assignment
 */
public class Assignment {

    private static int nextClassworkID = 1 ;
    private static int nextHomeworkID = 1;
    private String name;
    private int pointValue;

    public Assignment(String type , int pV )
    {
        pointValue = pV;
        if ( type.equals("classwork"))
        {
            name = type + " " + nextClassworkID;
            nextClassworkID++;
        }
        else{
            name = type + " " + nextHomeworkID;
            nextHomeworkID++;
        }
    }
}