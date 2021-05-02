public class DescribeBehav
{
	public static void main(String[] args)
	{
		int x = 23; // intiaise and assign the value 23 to the interger variable x 
		int y = 17; // intiaise and assign the value 17 to the interger variable y
		
		x *= 4; // multypling the value of x by 4 and then storing it in the variable x.      Now the new value of x is 92
		y++ ; // adding 1 to the value of y and then assigning the value to  y ,   Now new value of y is 18
		x /= 3; // Dividing the value of x by 3 and then storing the new value to the variable x.  new value of x is 3
		y -= 9; // Substracting the initial value of y by 9 and then storing the new value to y .    New value of y is 9
		x %= y; // Getting the remainder when x is divided by y , and then storing the new value to x ,    New value of x is 3

		System.out.println(x); // 3 is printed
	}
}