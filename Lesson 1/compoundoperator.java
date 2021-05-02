public class compoundoperator 
{
    public static void main(String[] args) 
    {
        int x = 6; // x= 6
        x += 7; // x = 13
        x -= 3; // x = 10
        x *=10; // x = 100
        x /= 5; // x = 20
        x %=3; // x = 2

        int y = 1;
        int z = x++ + ++y + x; // 2 + 2
        System.out.println(x); // 2
        System.out.println(z);
    }
}
