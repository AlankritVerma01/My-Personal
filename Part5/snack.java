package Part5;
/** Programmer : Alankrit Verma
 * Date created : Fri May 14 2021
 * File name : snack.java
 * Purpose : 
 * Comments : 
 */
/**
 * snack
 */
public class snack {

    private String name; //privatee instace variables
    private int calories;

    public snack()  // dedault constructor
    {
        name = "";
        calories = 0;
    }

    public snack(String n , int c)  // overloaded constructor
    {
        name = n ;
        calories = c;
    }

    public String getName()  // accessor method
    {
        return name;
    }

    public int getCalories()  // accessor methods
    {
        return(calories);
    }

    public void setname(String n) // mutator methods
    {
        name = n;
    }

    public void setCalories(int c)  // mutator methods
    {
        calories = c;
    }

    private boolean canEat()
    {
        return(calories <150);
    }
}