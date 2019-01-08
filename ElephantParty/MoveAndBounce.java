import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MoveAndBounce extends Actor
{
   private int speed;
   private String name;
    
   public MoveAndBounce()
   {
       this.speed=1;
       this.name=null;
   }
   
   public MoveAndBounce(int speed, String name)
   {
       this.speed=speed;
       this.name=name;
   }

   
   public String toString()
   {
      String output = ("Name: " + this.name + "\nx-coordinates: " + this.getX() + "\ny-coordinates: " + this.getY() + "\nSpeed: " + this.speed);
      // String somethingdifferent = ("x-coordinates: " + this.getX());
       //String something = ("y-coordinates: " + this.getY());
      // String different = ("speed: " + this.speed);
       
      return output;
       
   }
   
      
   public void act()
   {
       move(this.speed);
       
       if(isAtEdge())
       {
           int angle= (int)(Math.random()*90+1);
           turn(angle);
           this.speed=speed+1;
       }
       
       getWorld().showText(toString(),getWorld().getWidth()/2,getWorld().getHeight()/2);
    }
}
