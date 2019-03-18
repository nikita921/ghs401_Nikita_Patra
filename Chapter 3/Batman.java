
public class Batman extends Superhero
{
    private String animal;
    
    public Batman()
    {
        super();
        this.animal = null;
    }

    public Batman(String name, boolean canFly, String animal)
    {
        super(name,canFly);
        this.animal = animal;
    }
    
    public boolean hasCar()
    {
        return true;
    }
    
    public String getMotto()
    {
        return "I am a bat";
    }
    
    public String toString()
    {
        return(super.toString() + "\nAnimal? " + this.animal+ "\n");
    }
}
