/**
 * Another subclass of the creature type. This is the elf class. 
 *
 * @author Daisry Joy Ladignon
 * @version 11.17.2018
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;


    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super(
        Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,
        Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
    }

    /**
     * Override creature's damage method to allow for an elf to deal a magic attack
     * @return the total damage to be dealt
     */
    public int damage()
    {
        int dmg;
        dmg = super.damage();
        
        if(Randomizer.nextInt(100)+1 <= 10){
            System.out.println("ELF!");
            dmg *= 2;
        }
        return dmg;
    }
}