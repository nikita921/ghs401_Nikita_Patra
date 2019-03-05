import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Spaceship extends Actor
{
    private List<Star> starData;
    private int speed;
    public Spaceship(int speed) 
    {
        
        this.speed = speed;
        //stargetWorld().getObjects(Star.class);
        
        /*Star s1 = new Star();
        Star s2 = new Star();
        Star s3 = new Star();
        Star s4 = new Star();
        Star s5 = new Star();
        Star s6 = new Star();
        
        starData.add(s1);
        starData.add(s2);
        starData.add(s3);
        starData.add(s4);
        starData.add(s5);
        starData.add(s6);*/
    }
    
    public double calcAverageLuminosity()
    {
        
        int x = 0;
        int counter = 0;
        for(int i = 0; i < starData.size(); i++) 
        {
            x += starData.get(i).getL();
            if(starData.get(i).getL() > 0) 
            {
                counter ++;
            }
        }
        if(counter != 0)
        {
            return (double)x/counter;
        }
        return 0;
    }
    
    public int calcMaxLuminosity()
    {
        int x = 0;
        int y = 0;
        for(int i = 0; i < starData.size(); i++) 
        {
            y = starData.get(i).getL();
            if(y > x)
            {
                x = y;
            }
        }
        return x;
    }
    
    public void act() 
    {
        starData = getWorld().getObjects(Star.class);
        getWorld().showText(String.valueOf(calcAverageLuminosity()),100,100);
        move(1);
        if(isAtEdge())
        {
            move(-1);
            turn((int)(Math.random()*90+1));
        }
    }    
}
