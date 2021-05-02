import java.util.Scanner; // importing the scaner to get the input from the user

class My_Codesnames
{
    public static void display( String name[], int grade[])
    {
        for(int i = 1 ; i<=3 ; i++)
        {
            System.out.println(name[i]+" is the name of the student who has scored " + grade[i] + " marks");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[4];
        int[] grade = new int[4];
        for (int i = 1 ; i<=3 ; i++)
        {
             System.out.println("Enter the names of the " + i + " Student");
             name[i] = sc.next();
             System.out.println("Enter the grade of that child");
             grade[i] = sc.nextInt();             
        }
       display(name, grade);
       sc.close();
    }
}