import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SpaceJunk extends Actor
{
    private int age;
    public SpaceJunk()
    {
        this.age = (int)(Math.random()*200000);
    }
    
    public SpaceJunk(int age) {
        this.age = age;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public void setAge(int a)
    {
        this.age = a;
    }
    
    public void act() 
    {
        age = age + 500;
        getWorld().showText(age +"", getX(), getY());
    }    
    
    public String toString()
    {
        String output = ("Current age: " + age);
        return output;
    }
    
    
}
