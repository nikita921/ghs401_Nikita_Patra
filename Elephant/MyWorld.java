import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    public MyWorld()
    {
        super(600,400,1);
        addObject(new Elephant(6),100,100);
        addObject(new Elephant(5),200,200);
        addObject(new Elephant(4),300,300);
        
        showText(" ",getWidth()/2,100);
        
    }
}
