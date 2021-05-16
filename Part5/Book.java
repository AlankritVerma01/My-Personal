/** Programmer : Alankrit Verma
 * Date created : Fri May 14 2021
 * File name : book.java
 * Purpose : 
 * Comments : 
 */
package Part5;

public class Book
{
    private String title;
    private String genre;
    private String author;
    private int numpages;

    public Book()
    {
        title = "";
        genre = "";
        author = "";
        numpages = 0;
    }

    public Book(String t , String g , String a, int np)
    {
        title = t;
        genre = g;
        author = a;
        numpages = np;
    }
}