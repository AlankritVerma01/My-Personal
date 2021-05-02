public class CastAndRound 
{
	public static void main(String[] args)
	{
		double number = 11.0 / 4;
		int roundNumber = (int)(number + 0.5);
		
		System.out.println("11.0/4 =" + number);
		System.out.println(" 11 / 4 = " + (int)number);
		System.out.println( " 11.0/4 rounded = " + roundNumber);


		double Number = -11.0 / 4;
		int RoundNumber = (int)(Number - 0.5);
		
		System.out.println(" -11.0 / 4 = " + Number);
		System.out.println(" -11/4 = " + (int)(Number));
		System.out.println(" -11.0/4 rounded = " + RoundNumber);
	}
}
