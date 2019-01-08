import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
  private int speed;
  
  public Elephant()
  {
      this.speed=1;
  }
  
  public Elephant(int speed)
  {
      this.speed=speed;
  }
  
  public void act()
  {
      move(this.speed);
      
    if(isAtEdge())
    {
      turn(37);
    }

    
    getWorld().showText("x-coordinates: " + this.getX(),200,200);
  }
  
  }


