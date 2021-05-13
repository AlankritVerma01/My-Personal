/** Programmer : Alankrit Verma
 * Date created : Thu May 13 2021
 * File name : bankaccountFor.java
 * Purpose : no
 * Comments : no
 */
package Part4;
class bankAccountFor
{
    public static void main(String[] args)
    {
        int savings = 200;
        int interest = 10;
        int time = 50;
        int total_savings = 0;
        
        for( int i = 0 ; i <=time ; i++)
        {
            total_savings = total_savings + savings*interest/100;
        }

        System.out.println(total_savings);
    }
}