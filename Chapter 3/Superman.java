

public class Superman extends Superhero
{
    private String color;

    public Superman()
    {
        super();
        this.color = null;
    }

    public Superman(String name, boolean canFly, String color)
    {
        super(name,canFly);
        this.color = color;
    }
    
    public String getMotto()
    {
        return "I fly";
    }
    
    public String toString()
    {
        return(super.toString() + "\nColor? " + this.color + "\n");
    }
}
