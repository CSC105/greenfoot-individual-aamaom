import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.Color;

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
    public Text()
    {
        this("");
    }
 
    public Text(String text)
    {
        setText(text);
    }
 
    public void setText(String text)
    {
        setImage(new GreenfootImage(text, 24, Color.black, new Color(0, 0, 0, 0)));
    } 
}
