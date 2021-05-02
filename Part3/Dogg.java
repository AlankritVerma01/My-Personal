public class Dogg 
{
    private String name;
    private String breed;
    private int age;

    public Dogg(String nm, String br, int ag)
    {
        name = nm;
        breed = br;
        age = ag;
    }
    public void bark()
    {
        System.out.print("Woff!" + name + age + breed);
    }
}
