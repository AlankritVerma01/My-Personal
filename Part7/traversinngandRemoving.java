/** Programmer : Alankrit Verma
 * Date created : Sun May 16 2021
 * File name : traversinngandRemoving.java
 * Purpose : 
 * Comments : 
 */
package Part7;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * traversinngandRemoving
 */
public class traversinngandRemoving {

    public static void main(String[] args) {
        ArrayList<Integer> grade = new ArrayList<Integer>(5);
        int count = 0;

        while (count < 5)
        {
            int y = (int)(Math.random()*100);            
            if(y > 10)
            {
                grade.add(count, y);
                count++;
                System.out.println("we are processing here"+y);
            }
        }

        for(int i : grade) 
        {
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i = grade.size()-1 ; i >= 0 ; i--)
        {
            if (grade.get(i) < 70)
            {
                System.out.println("removing " + grade.get(i));
                grade.remove(i);
            }
        }

        for(int i : grade) 
        {
            System.out.println(i);
        }
        
        System.out.println("------------------------------------------------------");

       ArrayList<Integer> marks = new ArrayList<>(Arrays.asList(100,100,40,98,119,700));

        for(int i = marks.size()-1; i >= 0 ; i--)
        {
            if(marks.get(i) < 70)
            {
                System.out.println("removed " + marks.get(i) );
                marks.remove(i);
            }
        }

        for(int i : marks)
        {
            System.out.println(i);
        }
    }
}