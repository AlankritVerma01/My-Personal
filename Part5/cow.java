/** Programmer : Alankrit Verma
 * Date created : Fri May 14 2021
 * File name : coq.java
 * Purpose : 
 * Comments : 
 */
package Part5;

/**
 * coq
 */
public class cow {

    private String typeOfCow;
    private String sound;
    private int numMilkings;

    public cow()
    {
        typeOfCow = "";
        sound = "";
        numMilkings = 0;
    }

    public cow(String type , String s)
    {
        typeOfCow = type;
        sound = s;
        numMilkings = 0;
    }

    public void milkCow()
    {
        numMilkings++;
    }

    public String getSound()
    {
        return(sound);
    }

    public String getType()
    {
        return(typeOfCow);
    }

    public int getNumMilkings()
    {
        return(numMilkings);
    }


}