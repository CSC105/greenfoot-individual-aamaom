import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class No here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class No extends Control
{
    /**
     * Act - do whatever the No wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        check();
    }
    
    public void check()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.delay(2);
            Open op = new Open();
            Greenfoot.setWorld(op);
        }
    }
}
