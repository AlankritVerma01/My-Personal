/** Programmer : Alankrit Verma
 * Date created : Mon May 03 2021
 * File name : practise.java
 * Purpose :  Question 7 of the baron chapter 2
 * Comments : 
 */

package Barronac.chapter2;

class Datee {

    public Datee(int mo, int da, int yr) {
        int month = mo;
        int date = da;
        int year = yr;
    }

    public static void main(String[] args) {
        Datee d = new Datee(1, 13, 2002);
        String s = d.toString();
        System.out.println(s);
    }
}