import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends World
{

    /**
     * Constructor for objects of class Win.
     * 
     */
    public Win()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        setBackground("op2.png");
        
        Back back = new Back();
        addObject(back,672,443); 
        
        act();
    }
    
     public void act(){
      Actor image = new Actor(){};
      image.setImage(new GreenfootImage("You Win", 80, Color.white, null));//You can also add any other text you want here;
      addObject(image, getWidth()/2, getHeight()/2);
    }
}
