

public class Superhero
{
    // instance variables - replace the example below with your own
    private String name;
    private boolean canFly;
    public Superhero()
    {
        this.name = null;
        this.canFly = false;
    }

    public Superhero(String name, boolean canFly)
    {
        this.name = name;
        this.canFly = canFly;
    }
    
    /*public String getMotto()
    {
        return "I save lives";
    }*/
    
    public String toString()
    {
        return("Name: " + this.name + "\nCan Fly? " + this.canFly);
    }
}
