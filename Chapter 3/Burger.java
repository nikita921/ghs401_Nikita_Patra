
public class Burger extends Food
{
    private boolean withFries;
    
    public Burger(boolean isTasty, boolean isSavory, boolean withFries)
    {
       super(isTasty,isSavory);
       this.withFries = withFries;
    }
    
    public boolean extraAvacado(boolean Avacado)
    {
        return Avacado;
    }
    
    public boolean isEaten()
    {
        return false;
    }
    
    public String toString()
    {
        return(super.toString() + "\nWith Fries? " + this.withFries);
    }

   
}
