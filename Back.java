import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Control
{
    private GreenfootImage s1 = new GreenfootImage("back.png");
    private GreenfootImage s2 = new GreenfootImage("back2.png");
    
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       check();
    }
    
    public Back()
    {
        setImage(s2);   
    }
    
    public void check()
    {
        if(Greenfoot.mouseClicked(this))
        {
            setImage(s2);
            Greenfoot.delay(2);
            Open op = new Open();
            Greenfoot.setWorld(op);
        }   
    }
}
