import java.util.Random;

/**
 * Used to generate random numbers whereever they are needed 
 * throughout the program, such as calculating damage 
 * and stats of the "creatures"
 * 
 * @author Daisry Joy Ladignon
 * @version 11.17.2018
 */
public class Randomizer
{
    // instance variables - replace the example below with your own
    private static Random rand;

    /**
     * Constructor for objects of class Randomizer
     */
    public Randomizer()
    {
        rand = new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static int nextInt(int y)
    {
        if (rand == null) {
            rand = new Random();
        }
        
        return rand.nextInt(y);
    }
}
