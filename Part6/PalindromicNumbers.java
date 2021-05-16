package Part6;
/** Programmer : Alankrit Verma
 * Date created : Sun May 16 2021
 * File name : PalindromicNumbers.java
 * Purpose : to reverse an array
 * Comments : 
 */
/**
 * PalindromicNumbers
 */
public class PalindromicNumbers {

    private int[] list;
    
    public PalindromicNumbers(int numPalindromes , int start){
       list = new int[numPalindromes];
       int count = 0;
       while(count < numPalindromes)
       {
           if(isPalindromis(start))
           {
               list[count] = start;
               count++;
           }
           start++;
       }

       /** for ( int i = 0; i <list.length; i++)
        * {
            if (isPalindromic(start))
            {
                list[i] = start;
            }
            else
            i--;
            start++;
        }
        * 
        */

    }

    //returns wheter nnum is a palindrome in base 10 and base 2
    private static boolean isPalindromis(int num){
        boolean check = false;
        int rem=num;
        int rev = 0;
        while(rem>0){
            rev = rev*10 + rem%10;
            rem /= 10;
        }
        if(rev == num)
        check = true;
        return check;
    }

    public int sum(){
        int sum = 0;
        for(int i = 0 ; i<list.length; i++)
        {
            sum += list[i];
        }
        return sum;
    }
}