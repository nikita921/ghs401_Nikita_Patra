import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(new MoveAndBounce(5, "Sebastian"),100,100);
        addObject(new MoveAndBounce(2, "Sydney"),100,100);
        

        
        
    }
}