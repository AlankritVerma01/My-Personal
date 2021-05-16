/** Programmer : Alankrit Verma
 * Date created : Sat May 15 2021
 * File name : ArrayManipulator.java
 * Purpose : FRQ pratise
 * Comments : IMP
 */
package Part6;

/**
 * ArrayManipulator
 */
public class ArrayManipulator {
    private int[] list;

    public ArrayManipulator ( int numElements)
    {
        list = new int[numElements];
    }

    public int getMiddleIndex()
    {
        int length = (int)list.length; 
        if(length == 0)
        return length/2;
        else
        return length/2 -1 ;
    }

    public double getAvg()
    {
        return (list[0] + list[getMiddleIndex()] + list[list.length-1])/3.0;
    }
}