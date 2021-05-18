/** Programmer : Alankrit Verma
 * Date created : Tue May 18 2021
 * File name : try.java
 * Purpose : 
 * Comments : 
 */
/**
 * try1
 */
public class mcq3day4 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int sum = 0;
        for ( int [] x : arr)
        {
            for ( int y = 0 ; y < x.length-1 ; y++)
            {
                sum += x[y];
                System.out.println(y +" "+x[y]);
            }
        }
        System.out.println(sum);
    }
}