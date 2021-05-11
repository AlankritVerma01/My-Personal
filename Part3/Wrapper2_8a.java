
/** Programmer : Alankrit Verma
 * Date created : Mon May 10 2021
 * File name : Wrapper2_8a.java
 * Purpose : 
 * Comments : 
 */
package Part3;

import java.lang.*;

class wrapper2_8a {
    public static void main(String[] args) {
        Integer num1 = new Integer(157); // creating new object
        System.out.println(num1); // displaying object

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1); // wrap around

        int num1int = num1.intValue(); // 4th method
        System.out.println(num1int); // display of 4th method
    }
}