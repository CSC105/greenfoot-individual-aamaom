import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Control
{
    private GreenfootImage s1 = new GreenfootImage("start1.png");
    private GreenfootImage s2 = new GreenfootImage("start2.png");
    
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        check();
    }
    
    public Start()
    {
        setImage(s1);
    }
    
    public void check()
    {
        if(Greenfoot.mouseClicked(this))
        {
            setImage(s2);
            Greenfoot.delay(2);
            World1 world1 = new World1();
            Greenfoot.setWorld(world1);
            
        }   
    }
}
