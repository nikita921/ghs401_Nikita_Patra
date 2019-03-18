

public class Hulk extends Superhero
{
    private String size;

    public Hulk()
    {
        super();
        this.size = null;
    }

    public Hulk(String name, boolean canFly, String size)
    {
        super(name,canFly);
        this.size = size;
    }
    
    public String getMotto()
    {
        return "I am green";
    }
    
    public String toString()
    {
        return(super.toString() + "\nSize? " + this.size+ "\n");
    }
}
