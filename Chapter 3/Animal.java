
public class Animal
{
    private int leg;
    private boolean alive;
    
    public Animal()
    {
        this.leg = 0;
        this.alive = false;
    }
    
    public Animal(int leg, boolean alive)
    {
        this.leg = leg;
        this.alive = alive;
    }
    
    public String toString()
    {
        return("Legs: " + this.leg + "\nAlive? " + this.alive);
    }
}
