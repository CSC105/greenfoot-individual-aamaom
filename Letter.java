import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class letter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter extends Object
{
    private final GreenfootImage f1 = new GreenfootImage("letter.png");
    
    /**
     * Act - do whatever the letter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        isSent();
    }
    
     public Letter()
    {
        setImage(f1);
    }
    
    public void isSent(){
        if(isTouching(Bird.class)){
            World myWorld = getWorld();
            World1 myworld = (World1)myWorld;
            Count counter = myworld.getCount();
            counter.addScore();
            getWorld().removeObject(this);
            Greenfoot.playSound("Flam3.wav");
            
        }
    }
}
