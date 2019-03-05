import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Star extends Actor
{
    private int l;
    public Star()
    {
        this.l = (int)(Math.random()*500+501);
    }
    public void act() 
    {
        l--;
        getWorld().showText(String.valueOf(l), getX(), getY());
        if(l <= 0) 
        {
            getWorld().removeObject(this);
        }
    }    
    public int getL() 
    {
        return this.l;
    }
}
