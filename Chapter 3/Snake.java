

public class Snake extends Animal
{
    private boolean isPoisonous;
    
    public Snake()
    {
        super(); //calls the Animal zero-argument constructor
        this.isPoisonous = false;
    }

    public Snake(int legs, boolean alive, boolean isPoisonous)
    {
        super(legs, alive); //calls the 2-argument constructor
        this.isPoisonous = isPoisonous;
    }
    
    public String slither()
    {
        return "I am slithering";
    }
    
    public String toString()
    {
        return("\nIs Poisonous? " + this.isPoisonous + "\n" + super.toString() + "\n" );
    }
}
