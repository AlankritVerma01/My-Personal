package Part3;
public class letter
{
    public void writeLetter()
    {
        greeting();
        speaicalMessage();
        speaicalMessage();
        closing();
    }

    public void greeting()
    {
        System.out.println("Hi, friend!");
    }

    public void speaicalMessage()
    {
        System.out.println("Computer science  is awrsome!");
    }

    public void closing()
    {
        System.out.println("See you soon!");
    }

    public static void main(String[] args)
    {
        letter friendLetter = new letter();
        friendLetter.writeLetter();
    }
}