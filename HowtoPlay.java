import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class HowtoPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowtoPlay extends World
{
    /**
     * Constructor for objects of class HowtoPlay.
     * 
     */
    public HowtoPlay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        setBackground("op3.png");
        //setBackground("Control2.png");
        Back back = new Back();
        addObject(back,660,400);  
        Arrow arr = new Arrow();
        addObject(arr,180,330); 
        Apple app = new Apple();
        addObject(app,405,140); 
        Mushroom mash = new Mushroom();
        addObject(mash,485,140); 
        Letter let = new Letter();
        addObject(let,415,330); 
    }
   
}
