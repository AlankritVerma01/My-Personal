public class lamp
{
    public void turnOn()
    {
        System.out.println("The lamp is on");
    }

    public void turnOff()
    {
        System.out.println("The lamp is off");
    }

    public static void main(String[] argsStrings)
    {
        lamp lamp1 = new lamp();
        lamp1.turnOn();

        lamp lamp2 = new lamp();
        lamp2.turnOn();
        lamp1.turnOff();
    }
}