/** Programmer : Alankrit Verma
 * Date created : Fri May 14 2021
 * File name : pet.java
 * Purpose : 
 * Comments : 
 */
package Part5;

public class pet
{
    private String name;
    private String typeOfPet;
    private int age;

    public void setName(String n) // mutator methods
    {
        name = n;
    }

    public void setTypeOfPet(String t)  // mutator methods
    {
        typeOfPet= t;
    }

    public void setAge(int a)
    {
        age = a;
    }

    public String getName(){
        return(name);
    }

    public String getTypeOfPet(){
        return(typeOfPet);
    }

    public int getAge(){
        return(age);
    }
}