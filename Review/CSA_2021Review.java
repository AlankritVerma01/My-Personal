package Review;
// AP Daily: Live Review 2021
// Class for student objects
// April 20, 2021

public class CSA_2021Review
{
	// private instance variables 
	 private String initials;
    private String hsName;
    private String location;
	 private int gradYear;

	/**
	 * Constructor for objects of class CSA_2021Re
	 */
  
	public CSA_2021Review(String ini, String loc, int gY) //constructor
	{
		// initialize instance variables
	    initials = ini;
       location = loc;
       gradYear = gY;
	}

   public CSA_2021Review(String ini, String hs, String loc, int gY) //overloaded constructor
	{
		// initialize instance variables
	    initials = ini;
       hsName = hs;
       location = loc;
       gradYear = gY;
	}

	public String getInfo()
	{
	    return initials + " " + gradYear;
	}

	public void setInfo(String ini, int gY)
	{
	   initials = ini;
      gradYear = gY;
	}

	public String toString() 
	{
	    return initials + ":" + "\t\t\t" + gradYear + "\t\t\t" + location + "\t\t " + hsName;
	}
	
	//ends Class declaration
	
	//declares, starts the main method
	
	public static void main(String[] args)
	{
	
	CSA_2021Review WEW = new CSA_2021Review("WEW", "Stillwater, OK, USA", 2021);
   CSA_2021Review Maggie = new CSA_2021Review("Maggie", "Trevor Packer HS", "New York, NY, USA", 2021);
   CSA_2021Review RobS = new CSA_2021Review("RDS", "Newton HS", "Pleasant Hill, OH, USA", 1987);
   CSA_2021Review JillW = new CSA_2021Review("JHW", "Huffman HS", "Birmingham, AL, USA", 1986);
	System.out.println(WEW);
   System.out.println(Maggie);
   System.out.println(RobS);
   System.out.println(JillW);
   System.out.println();
   System.out.println(Maggie.getInfo());
	//add yourself as an instance of the class below this comment
	
	
	
	
	
	
	
	
	}
	        
}
