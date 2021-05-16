/** Programmer : Alankrit Verma
 * Date created : Fri May 14 2021
 * File name : snackdriver.java
 * Purpose : 
 * Comments : 
 */
package Part5;

/**
 * snackdriver
 */
public class snackdriver {

    public static void main(String[] args) {
        snack choiceone= new snack("cookies", 100);
        snack choicetwo= new snack();
        System.out.println(choiceone.getName());
        System.out.println(choicetwo.getCalories());
        choicetwo.setname("chips");
        //choicetwo.calories = 150;     calories is private , if it was public it could be implemented
        //System.out.println(choicetwo.canEat());   not possible as the canEat was private
    }
}