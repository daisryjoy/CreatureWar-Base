/**
 * A subtype of the demon class. Attacks twice on each attack
 *
 * @author Daisry Joy Ladignon
 * @version 11.17.2018
 */
public class Balrog extends Demon 
{
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;


    /**
     * Constructor for objects of class Cyberdemon
     */
    public Balrog()
    {
        super(
        Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,
        Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );
    }

    /**
     * To achieve the double attack, we call the Demon's damage method twice to ensure
     * two seperate damage values, then combine the attacks to be measured easier
     * @return the total damage to be dealt
     */
    public int damage(){
        int deal = super.damage()+ super.damage();
        return deal;
    }
}