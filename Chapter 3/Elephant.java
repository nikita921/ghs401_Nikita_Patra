

public class Elephant extends Animal
{
    // instance variables - replace the example below with your own
    private boolean canTrumpet;

    public Elephant()
    {
        super();
        this.canTrumpet = false;
    }

    public Elephant(int leg, boolean alive, boolean canTrumpet)
    {
        super(leg,alive);
        this.canTrumpet = canTrumpet;
    }
    
    public String toString()
    {
        return("\nCan Trumpet? " + this.canTrumpet + "\n" + super.toString()+"\n" );
    }
    
    public String snort() {
        return "nehghhhenehghe!!!!!!!";
    }
}
