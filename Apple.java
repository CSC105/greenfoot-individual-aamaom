import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Object
{
    private int frame;
    private final GreenfootImage f1 = new GreenfootImage("apple1.png");
    private final GreenfootImage f2 = new GreenfootImage("apple2.png");
    private final GreenfootImage f3 = new GreenfootImage("apple3.png");
    
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animation();
    }
    
    public Apple()
    {
        setImage(f1);
    }
    
    public void animation()
    {
        frame++;
        if(frame==20)
        {
            setImage(f1);
        }
        else if(frame==40)
        {
            setImage(f2);
        }
        else if(frame==60)
        {
            setImage(f3);
            frame = 1;
            return;
        }
        
    }
}
