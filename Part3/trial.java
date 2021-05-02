import java.util.Scanner; // importing the scaner to get the input from the user

class trial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        n=22;
        if(n>0)
        if(n%5==0)
        System.out.println(n);
        else
        System.out.println(n + "n is negative");
       sc.close();
    }
}