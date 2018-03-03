import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Yes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yes extends Control
{
    /**
     * Act - do whatever the Yes wants to do. This method is called whenever
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
            World1 world1 = new World1();
            Greenfoot.setWorld(world1);
        }
    }
}
