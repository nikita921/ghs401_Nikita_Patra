import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Robot extends Actor
{
    private String name;
    private int speed;
    private int batteryLevel;
    int i = speed*3;
    
    public Robot()
    {
        String name = null;
        int speed = 0;
        int batteryLevel = 0;
    }
    
    public Robot(String name, int speed, int batteryLevel)
    {
        this.name = name;
        this.speed = speed;
        this.batteryLevel = batteryLevel;
    }
    
    public String toString()
   {
      String output = ("Speed: " + this.speed + "\nBattery Level: " + this.batteryLevel);

      return output;
       
   }
    private int actCounter;
    public void act()
    { 
        actCounter++;

        if(batteryLevel>0)
        {
            move(speed);
            if(actCounter%3==0)
            {
                batteryLevel=batteryLevel-1;
            
            }
        
        }
        else if (batteryLevel<=0)
        {
            move(0);
        }

        if(isAtEdge())
        {
            move(-1);
            turn(90);
        }
        
        else
        {
            
        }
        
        getWorld().showText(toString(), getWorld().getWidth()/2, getWorld().getHeight()/2);
    }
}

