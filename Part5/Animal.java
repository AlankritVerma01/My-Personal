package Part5;
/** Programmer : Alankrit Verma
 * Date created : Sat May 15 2021
 * File name : Animal.java
 * Purpose : 
 * Comments : 
 */
/**
 * Animal
 */
public class Animal {

    private String typeOfAnimal;
    private int age;

    public Animal(String type , int a)
    {
        typeOfAnimal = type;
        age= a;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int a)
    {
        age = a;
    }
}