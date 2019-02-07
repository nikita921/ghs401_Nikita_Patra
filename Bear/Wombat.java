import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Wombat extends Actor
{
   private int xDestination;
   private int yDestination;
   private int speed;
   
   public Wombat(int speed)
   {
       this.speed=speed;
       
       
    }

   public double calcTripDistance()
   {
       
       double y = getY();
       double x = getX();
       double a = MyWorld.getDotX() - x;
       double b = MyWorld.getDotY() - y;
       double c = a*a + b*b;
       double d = Math.sqrt(c);
       return d;
       
   }
   
   public double calcTripTravelTime()
   {
       double t = calcTripDistance()/speed;
       return t;
   }
   
   public void act()
   {
       move(speed);
       
       if(isAtEdge()){
           int x = (int)(Math.random()*90+1);
           //move(-1);
           turn(x);
        }
       
       getWorld().showText("Distance to destination is: " + calcTripDistance() + " km", getWorld().getWidth()/2, getWorld().getHeight()-100);
       getWorld().showText("Time: " + calcTripTravelTime() + " hours", getWorld().getWidth()/2, getWorld().getHeight()-200);
   }
}
