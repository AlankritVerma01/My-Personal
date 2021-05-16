/** Programmer : Alankrit Verma
 * Date created : Fri May 14 2021
 * File name : Sport.java
 * Purpose : USe of toString funciton
 * Comments : 
 */
package Part5;

public class Sport {
    private String name;
    private int numAtheletes;

    public Sport(String n, int num)
    {
        name = n;
        numAtheletes = num;
    }

    public String getName(){
        return name;
    }

    public int getNumAtheletes(){
        return numAtheletes;
    }

    public String toString(){
        return "Sport: " + name + "\nNumber of Atheletes: " + numAtheletes;
    }
}