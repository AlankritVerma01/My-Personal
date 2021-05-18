package Part9.performer;
/** Programmer : Alankrit Verma
 * Date created : Mon May 17 2021
 * File name : Performer.java
 * Purpose : 
 * Comments : 
 */
public class Performer
{
    private String name;
    private int age;

    public Performer()
    {
        name = "Ima performer";
        age = 16;
    }

    public Performer(String n, int a)
    {
        name = n;
        age = a;
    }

    public String getName(){
        return name;
    }

    public void practice(){
        System.out.println("Honing my craft!");
    }

    public void perform(){
        System.out.println("Performing for an audience");        
    }
}
