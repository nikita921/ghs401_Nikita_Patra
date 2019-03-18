

public class Pi extends Food
{
    private String type;

    public Pi(boolean isTasty, boolean isSavory, String type)
    {
        super(isTasty,isSavory);
        this.type = type;
    }
    
    public boolean isEaten()
    {
        return false;
    }
    
    public int slices(int slices)
    {
        return slices;
    }

    public String toString()
    {
        return(super.toString() + "\nType? " + this.type);
    }
}
