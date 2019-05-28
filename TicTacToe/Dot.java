import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dot extends Actor
{
    public Dot()
    {
        
    }
    public void act() 
    {
        if(this.isTouching(Skull.class)||this.isTouching(Smiley.class)){
            getWorld().removeObject(this);
        }
    }    
}
