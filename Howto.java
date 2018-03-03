import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Howto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Howto extends Control
{
    private GreenfootImage s1 = new GreenfootImage("howto1.png");
    private GreenfootImage s2 = new GreenfootImage("howto2.png");
    
    /**
     * Act - do whatever the Howto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        check();
    }    
    
    public Howto()
    {
        setImage(s2);   
    }
    
    
    public void check()
    {
        if(Greenfoot.mouseClicked(this))
        {
            setImage(s2);
            Greenfoot.delay(2);
            HowtoPlay htp = new HowtoPlay();
            Greenfoot.setWorld(htp);
        }   
    }
}
