import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Open here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Open extends World
{
    /**
     * Constructor for objects of class Open.
     * 
     */
    public Open()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        setBackground("op1.png");
        Start start = new Start();
        this.addObject(start,386,296);
        Howto howto = new Howto();
        this.addObject(howto,386,388); 
        Name na = new Name();
        addObject(na,390,105); 
    }
}
