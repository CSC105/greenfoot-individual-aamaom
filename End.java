import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{

    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {    
        super(800,532,1); //x,y
        setBackground("end.png");
        GameOver go = new GameOver();
        addObject(go,393,396);
        Yes y = new Yes();
        addObject(y,395,393);
        No n = new No();
        addObject(n,388,446);
    }
}
