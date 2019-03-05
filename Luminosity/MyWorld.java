import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    private Spaceship s1;
    
    
    public MyWorld()
    {
        super(600, 400, 1); 
        
        addObject(new Star(), 400, 200);
        addObject(new Star(), 500, 100);
        addObject(new Star(), 300, 300);
        addObject(new Star(), 500, 200);
        addObject(new Star(), 600, 100);
        addObject(new Star(), 400, 200);
        
        this.s1 = new Spaceship(3);
        addObject(this.s1, 100, 100);
        
    }
    
    
    
    public void act()
    {
        //showText(String.valueOf(this.s1.calcAverageLuminosity()),100,100);
        
    }
    
    
}
