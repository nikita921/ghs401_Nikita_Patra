import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{

    
    public MyWorld()
    {
        super(600, 400, 1); 
        
        SpaceJunk s1 = new SpaceJunk();
        SpaceJunk s2 = new SpaceJunk();
        SpaceJunk s3 = new SpaceJunk();
        SpaceJunk s4 = new SpaceJunk();
        SpaceJunk s5 = new SpaceJunk();
        SpaceJunk s6 = new SpaceJunk();
        Rocket r1 = new Rocket();
        
        addObject(s1, 400, 123);
        addObject(s2, 450, 321);
        addObject(s3, 200, 234);
        addObject(s4, 100, 194);
        addObject(s5, 230, 20);
        addObject(s6, 500, 323);
        addObject(r1, 402, 129);
    }
}
