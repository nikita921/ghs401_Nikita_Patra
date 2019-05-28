import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    private int counter = 0;
    private int[][] spots;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        spots = new int[3][3];
        
        for(int r = 0; r < spots.length; r++)
        {
            for(int c = 0; c < spots[0].length; c++)
            {
                Dot d1 = new Dot();
                addObject(d1,(c)*100 + 100,(r)*100 + 100);
                spots[r][c] = 0;
                
            }
        }
    }
    private boolean q = true;
    private boolean w = true;
    private boolean e = true;
    private boolean a = true;
    private boolean s = true;
    private boolean d = true;
    private boolean z = true;
    private boolean x = true;
    private boolean c = true;
    
    public void act()
    {
        
        if(Greenfoot.isKeyDown("q"))
        {
            if(q){
                q = false;
                if(counter%2 == 0){
                    addObject(new Skull(), 100 , 100);
                    spots[0][0] = 1;
                }
                else
                {
                    addObject(new Smiley(), 100 , 100);
                    spots[0][0] = 2;
                }
                counter ++;
            }
        }
        if(Greenfoot.isKeyDown("w"))
        {
            if(w){
                w = false;
                if(counter%2 == 0){
                    addObject(new Skull(), 200 , 100);
                    spots[0][1] = 1;
                }
                else
                {
                    addObject(new Smiley(), 200 , 100);
                    spots[0][1] = 2;
                }
                counter ++;
            }
        }
        if(Greenfoot.isKeyDown("e"))
        {
            if(e){
                e=false;
                if(counter%2 == 0){
                    addObject(new Skull(), 300 , 100);
                    spots[0][2] = 1;
                }
                else
                {
                    addObject(new Smiley(), 300 , 100);
                    spots[0][2] = 2;
                }
                counter ++;
            }
        }
        if(Greenfoot.isKeyDown("a"))
        {
            if(a){
                a = false;
                if(counter%2 == 0){
                    addObject(new Skull(), 100 , 200);
                    spots[1][0] = 1;
                }
                else
                {
                    addObject(new Smiley(), 100 , 200);
                    spots[1][0] = 2;
                }
                counter ++;
            }
        }
        if(Greenfoot.isKeyDown("s"))
        {
            if(s){
                s = false;
                if(counter%2 == 0){
                    addObject(new Skull(), 200 , 200);
                    spots[1][1] = 1;
                }
                else
                {
                    addObject(new Smiley(), 200 , 200);
                    spots[1][1] = 2;
                }
                counter ++;
            }
        }
        if(Greenfoot.isKeyDown("d"))
        {
            if(d){
                d = false;
                if(counter%2 == 0){
                    addObject(new Skull(), 300 , 200);
                    spots[1][2] = 1;
                }
                else
                {
                    addObject(new Smiley(), 300 , 200);
                    spots[1][2] = 2;
                }
                counter ++;
            }
        }
        if(Greenfoot.isKeyDown("z"))
        {
            if(z){
                z = false;
                if(counter%2 == 0){
                    addObject(new Skull(), 100 , 300);
                    spots[2][0] = 1;
                }
                else
                {
                    addObject(new Smiley(), 100 , 300);
                    spots[2][0] = 2;
                }
                counter ++;
            }
        }
        if(Greenfoot.isKeyDown("x"))
        {
            if(x){
                x = false;
                if(counter%2 == 0){
                    addObject(new Skull(), 200 , 300);
                    spots[2][1] = 1;
                }
                else
                {
                    addObject(new Smiley(), 200 , 300);
                    spots[2][1] = 2;
                }
                counter ++;
            }
        }
        if(Greenfoot.isKeyDown("c"))
        {
            if(c){
                c = false;
                if(counter%2 == 0){
                    addObject(new Skull(), 300 , 300);
                    spots[2][2] = 1;
                }
                else
                {
                    addObject(new Smiley(), 300 , 300);
                    spots[2][2] = 2;
                }
                counter ++;
            }
        }
        
        checkWinner();
    }
    
    public void checkWinner()
    {
        int skullCount = 0;
        int smileyCount = 0;
        for(int r = 0; r < spots.length; r++)
        {
            for(int c = 0; c < spots[0].length; c++)
            {
                if(spots[r][c] == 1)
                {
                    skullCount++;
                    
                }
                if(spots[r][c] == 2)
                {
                    smileyCount++;
                    
                }
                
            }
            if(skullCount == 3)
            {
                showText("Skull wins",getWidth()/2,getHeight()/2);
            }
            if(smileyCount == 3)
            {
                showText("Smiley wins",getWidth()/2,getHeight()/2);
            }
            skullCount = 0;
            smileyCount = 0;
        }
        
        for(int r = 0; r < spots[0].length; r++)
        {
            for(int c = 0; c < spots.length; c++)
            {
                if(spots[c][r] == 1)
                {
                    skullCount++;
                    
                }
                if(spots[c][r] == 2)
                {
                    smileyCount++;
                    
                }
                
            }
            if(skullCount == 3)
            {
                showText("Skull wins",getWidth()/2 + 100,getHeight()/2);
            }
            if(smileyCount == 3)
            {
                showText("Smiley wins",getWidth()/2 + 100,getHeight()/2);
            }
            skullCount = 0;
            smileyCount = 0;
        }
        
        if(spots[0][0] == 1 && spots[1][1] == 1 && spots[2][2] == 1)
        {
            showText("Skull wins",getWidth()/2 + 100,getHeight()/2);
        }
        if(spots[0][0] == 2 && spots[1][1] == 2 && spots[2][2] == 2)
        {
            showText("Smiley wins",getWidth()/2 + 100,getHeight()/2);
        }
        
        if(spots[0][2] == 1 && spots[1][1] == 1 && spots[2][0] == 1)
        {
            showText("Skull wins",getWidth()/2 + 100,getHeight()/2);
        }
        if(spots[0][2] == 2 && spots[1][1] == 2 && spots[2][0] == 2)
        {
            showText("Smiley wins",getWidth()/2 + 100,getHeight()/2);
        }
    }
}
