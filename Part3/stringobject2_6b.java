/** Programmer : Alankrit Verma
 * Date created : Sun May 09 2021
 * File name : string2_6.java
 * Purpose : 
 * Comments : 
 */
/**
 * string2_6
 */
package Part3;

class stringobject2_6b {
    public static void main(String[] args) {
        String me = "alankrit";
        String friend = new String("Keshu");

        String me_age = "17";
        String friend_age = "13";

        String myage = me + "\t" + me_age;
        friend += friend_age;

        System.out.println(myage);
        System.out.println(friend);
        System.out.println("Hello i am " + me + ". My age is - " + me_age);
        System.out.println(friend + "\t" + friend_age);
        System.out.println(friend + " and " + me + " are friends");
    }
}