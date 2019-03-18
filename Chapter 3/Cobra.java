

public class Cobra extends Snake
{
    // instance variables - replace the example below with your own
    private boolean canBite;

    
    public Cobra()
    {
        // initialise instance variables
        super();
        this.canBite = false;
    }
    
    public Cobra(int leg, boolean isAlive, boolean isPoisonous, boolean canBite)
    {
        super(leg, isAlive, isPoisonous);
        this.canBite = canBite;
    }

   
    public String toString()
    {
        return("Can Bite? " + this.canBite + "\n" + super.toString());
    }
}
