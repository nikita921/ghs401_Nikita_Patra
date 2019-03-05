import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

public class Rocket extends Actor
{
    private List<SpaceJunk> spaceJunkObjects ;
    private int x;
    public Rocket()
    {
        x = 0;
    }
    public int removeSpaceJunk(int maxAge)
    {
        spaceJunkObjects = getWorld().getObjects(SpaceJunk.class);
        for(int i = 0; i < spaceJunkObjects.size(); i++)
        {
            if(spaceJunkObjects.get(i).getAge() >= maxAge)
            {
               
                getWorld().removeObject(spaceJunkObjects.get(i));
                //spaceJunkObjects.remove(i);
                //i--;
                x++;
                
                System.out.println(spaceJunkObjects.size());
            }
        }
        return x;
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("right")) {
            setRotation(0);
            move(10);
        }
        if(Greenfoot.isKeyDown("left")) {
            setRotation(180);
            move(10);
        }
        if(Greenfoot.isKeyDown("up")) {
            setRotation(-90);
            move(10);
        } 
        if(Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(10);
        }
        if(this.isTouching(SpaceJunk.class))
        {
            removeSpaceJunk(200000);
        }
        getWorld().showText("Objects removed: " + x, 300, 200);
        
    }    
    
    
}
