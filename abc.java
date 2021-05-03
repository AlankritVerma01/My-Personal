import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String S = s.next();

        if(N>=0 && N <= 10)
        System.out.println(2*N);

        if(S.length()<= 15 && S.length()>=1)
        System.out.println(S);
        s.close();

    }
}