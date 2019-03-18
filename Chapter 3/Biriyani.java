
public class Biriyani extends Food
{
    private String type;
    public Biriyani(boolean isTasty, boolean isSavory, String Type)
    {
        super(isTasty,isSavory);
        type = Type;
    }
    
    public boolean isEaten()
    {
        return true;
    }
    
    public boolean isSpicy()
    {
        return true;
    }
    
    public String toString()
    {
        return(super.toString() + "\nType? " + this.type);
    }
    

}
