/** Programmer : Alankrit Verma
 * Date created : Sat May 15 2021
 * File name : pettester.java
 * Purpose : 
 * Comments : 
 */
package Part5;

/**
 * pettester
 */
public class pettester {

    public static void main(String[] args) {
        pet p = new pet();
        p.setName("Gus");
        p.setTypeOfPet("cat");
        p.setAge(12);
        System.out.println(p.getName());
        System.out.println(p.getTypeOfPet());
        System.out.println(p.getAge());
    }
}