public class B1_Expression 
{
    public static void main(String[] args)
    {
        int x = 3; 
        int y = 2;
        System.out.println( 8 * 6 - 14 % 3 + 8 / 2 );  
        /**
         * 48-2+4
         * 50 */           
        System.out.println( 8 * 6 - 14 % ( x + 8 ) / y  );
        /**
         * 48 - 14 % 11/2
         * 48 - 3/2 
         * 47
         */
    }
}
