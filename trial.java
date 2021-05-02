import java.util.Scanner; // importing the scaner to get the input from the user

class trial
{
   
    public void number(int n)
    {
        if(n>0)
        if(n%5==0)
        System.out.println(n);
        else
        System.out.println(n + "n is negative");
    }

    public void forloops(int m)
    {
        int count = 0;
        int n=m;
        for(count = 1 ; count<n ; n++)
        {
            System.out.println(count);
        }
    }

    public void whileloops()
    {
    }
    public static void main(String[] args)
    {
        trial num= new trial();
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        num.number(n);

        System.out.println("enter forloops no");
        num.forloops(sc.nextInt());

        System.out.println("enter whileloops no");








       sc.close();
    }
}