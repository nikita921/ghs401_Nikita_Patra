import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Rocket extends Actor
{
   private int speed;
   private boolean ISM = false;
       
    public Rocket()
    {
        this.speed = 50;
    }
    
    public void act() 
    {
        if(!(getY()==(getWorld().getHeight()-1))&& ISM == false ){
            move(speed);
            if(getX()==(getWorld().getWidth()-1))
            {
                move(-1);
                turn(90);
                move(10);
                turn(90);
            }
            if(getX()==0)
            {
                move(-1);
                turn(270);
                move(10);
                turn(270);
            }
            }
         else{
                setLocation((getWorld().getWidth())/2,(getWorld().getHeight())/2);
                ISM = true;
                getWorld().showText("Mission Accomplished", getWorld().getWidth()/2, getWorld().getHeight()/2);
                Greenfoot.stop();
            }
            
            
        
        
    }
}


