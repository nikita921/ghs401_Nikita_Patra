

public class HolidayCharacter
{
    private String name;
    private boolean hasBeard;
    private int presentDelivered;
    
    public HolidayCharacter()
    {
        this.name = null;
        this.hasBeard = false;
        this.presentDelivered = 0;
    }    
    
    public HolidayCharacter(String name, boolean hasBeard, int presentDelivered)
    {
        this.name = name;
        this.hasBeard = hasBeard;
        this.presentDelivered = presentDelivered;
        
    }
    
    public String toString()
    {
        String output =("Name: " + this.name + "\nHas Beard? " + this.hasBeard + 
        "\nNumber of Presents Delivered: " + this.presentDelivered);
        
        return output;
    }
}
