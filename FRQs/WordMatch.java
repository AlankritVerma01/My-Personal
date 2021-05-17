package FRQs;
public class WordMatch
{
    private static String secret;
    
    public WordMatch(String word)
    {
        secret = word;
    }

    public static int scoreGuess(String guess)
    {
        int length = guess.length();
        int lengthsec = secret.length();
        int occ = 0;
        
        for ( int i = 0; i <= lengthsec - length ; i++)
        {
            if( guess.equals(secret.substring(i , i + length)))
            {
                occ++;
            }
        }
        int score = occ* length * length;
        return ( score );
    }
    public static String findBetterGuess(String guess1 , String guess2)
    {
        int score1 = scoreGuess(guess1);
        int score2 = scoreGuess(guess2);
        String aa = "wrong";
        
        if ( score1 > score2)
        return guess1;
        else if( score2 > score1)
        return guess2;
        else if ( score1 == score2)
        {
            if(guess1.compareTo(guess2)>0)
            {
                return guess1;
            }
            else if(guess1.compareTo(guess2)<0)
            {
                return guess2;
            }
            else if(guess1.compareTo(guess2)==0)
            {
                return guess1;
            }
        }
        return aa;

    }
    public static void main(String[] args) {
        WordMatch aa = new  WordMatch("concatenation");
        System.out.println(scoreGuess("con"));
        System.out.println(findBetterGuess("con", "cat"));
        
    }
}