import java.util.ArrayList;
/**
 * Create the armies and simulate the battle
 *
 * @author Daisry Joy Ladignon
 * @version 11.17.2018
 */
public class War
{
    //Store the monsters in array lists
    private ArrayList<Creature> good = new ArrayList<Creature>();
    private ArrayList<Creature> evil = new ArrayList<Creature>();
        
    /**
     * Create 50 creatures per army. Randomizes a number to choose from each creature per side. 
     */
    public War()
    {
        // populate the armies
        for(int i=0; i<50; i++){
            int roll = Randomizer.nextInt(10)+1;
            if ((roll >= 1) && (roll <= 6))
            good.add(new Human());
            if ((roll >= 7) && (roll <= 10))
            good.add(new Elf());
        }
        for(int i=0; i<50; i++){
            int roll = Randomizer.nextInt(10)+1;
            if ((roll >= 1) && (roll <= 6))
            evil.add(new Demon());
            if ((roll >= 7) && (roll <= 8))
            evil.add(new Cyberdemon());
            if((roll >= 9) && (roll <= 10))
            evil.add(new Balrog());
            
        }     
    }
    
    /**
     * Start the "battle". As each creature is defeated, we add +1 to 
     * the count of fallen for that army.
     * 
     */
    public void battle(){
        int g =0;
        int e =0;
        int goodDead=0;
        int evilDead=0;
        //a few test cases
        /*
        for(Creature here: good){
        System.out.println(here);
        int dmg = here.damage();
        System.out.println(dmg);
    }
        for(Creature there: evil){
        System.out.println(there);
        int dmg = there.damage();
        System.out.println(dmg);
    }
    */
        for(Creature loop: evil){
            if(g==good.size()||e==evil.size())
            break;
        while(good.get(g).isAlive()&& evil.get(e).isAlive()){
            good.get(g).takeDamage(evil.get(e).damage());
            //make sure we are calculating the damage correctly
            System.out.println("Good HP: " + good.get(g).showHealth());
            evil.get(e).takeDamage(good.get(g).damage());
            System.out.println("Evil HP: " + evil.get(e).showHealth());
            if(good.get(g).isDead()){
                g++;
                System.out.println("A good one died");
                goodDead++;
            }
            if(evil.get(e).isDead()){
                e++;
                System.out.println("An evil one died!");
                evilDead++;
            }
            
        if(g==good.size()||e==evil.size())
        break;
    }
}
    System.out.println("Good Dead: "+goodDead + "\nEvil Dead: "+ evilDead);
    if(goodDead > evilDead){
        System.out.println("Evil has won today.");
    }else {
        System.out.println("Good has triumphed today.");
    }
}
    
    
}