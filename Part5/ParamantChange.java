/** Programmer : Alankrit Verma
 * Date created : Sat May 15 2021
 * File name : ParamantChange.java
 * Purpose : 
 * Comments : 
 */
package Part5;

/**
 * ParamantChange
 */
public class ParamantChange {

    public static void incrementParam(Mutable a){
        a.incrementValue();
    }

    public static void main(String[] args){
        Mutable x = new Mutable(33);
        Mutable y = new Mutable(35);
        incrementParam(y);
        incrementParam(x);
        y.incrementValue();
        System.out.println(y.getValue()+x.getValue());
        System.out.println(y.getValue());
    }
}