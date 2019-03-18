

public class Food
{
    private boolean isTasty;
    private boolean isSavory;
    
    
    public Food()
    {
        this.isTasty = false;
        this.isSavory = false;
    }
    
    public Food(boolean isTasty, boolean isSavory)
    {
        this.isTasty = isTasty;
        this.isSavory = isSavory;
    }

    public boolean isEaten()
    {
        return true;
    }
    
    public String toString()
    {
        return("Is it tasty? " + this.isTasty + "\nIs it savory? " + this.isSavory);
    }
}
