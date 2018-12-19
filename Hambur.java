public class Hambur
{
    //instance variables
    //this is a class called hamburger
    //from this class we can make as many 
    //hamburger instances (objects) as we want
    //instance variables 
    private boolean hasLettuce;
    private int numPatties;
    private String cheeseType;
    
    //zero argument constructor
    //this runs every time a zero argument hamburger is made
    //always named public className
    public Hambur()
    {
        //sets all instance variables to generic values
        //System.out.println("a hamburger was created");
        this.hasLettuce=false;
        this.numPatties=0;
        this.cheeseType=null;

    }
    
    //multi-arg constructor
    public Hambur(boolean hasLettuce, int numPatties, String cheeseType)
    {
        //set the instance variables to the argument variables
        System.out.println("HAMBURGER!");
        this.hasLettuce= hasLettuce;
        this.numPatties= numPatties;
        this.cheeseType= cheeseType;
    }
    
    //toString method
    public String toString()
    {
        String output="Has lettuce: " + this.hasLettuce + "\nPatties: " + this.numPatties + 
        "\nCheese Type: " + this.cheeseType;
        
        return output;
    }
   
}
