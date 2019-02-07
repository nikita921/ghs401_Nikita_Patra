import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    private static int dotX = 100;
    private static int dotY = 100;
    
    public MyWorld(){
        super(800, 800, 1);
        
        addObject(new Wombat(5),435,345);
        addObject(new dot(),dotX,dotY);
    }
    
    public static int getDotX(){
        return dotX;
    }
    public static int getDotY(){
        return dotY;
    }
}
