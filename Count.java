import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.Color;
import java.awt.Graphics;
    
/**
 * Write a description of class Count here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Count extends Actor
{
    private static final Color textColor = new Color(255, 180, 150);
        
    int score = 0;  
    
    /**
     * Act - do whatever the Count wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      setImage(new GreenfootImage("Score: " + score, 24, Color.BLACK, null));
    }
    
     public void addScore(){
             score++;
     }
}
