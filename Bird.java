import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Character
{
    private int speed = 3;
    private int frame;
    private boolean walking;
    private boolean walkRight;
    private boolean walkLeft;
    private boolean isKeyPressed = false;
    //private boolean foundPrincess = false;
    
    // ^ ,up
    private final GreenfootImage w1 = new GreenfootImage("Flamingo_r1.png");
    private final GreenfootImage w2 = new GreenfootImage("Flamingo_r2.png");
    private final GreenfootImage w3 = new GreenfootImage("Flamingo_r3.png");
    // < ,left 
    private final GreenfootImage a1 = new GreenfootImage("Flamingo_l1.png");
    private final GreenfootImage a2 = new GreenfootImage("Flamingo_l2.png");
    private final GreenfootImage a3 = new GreenfootImage("Flamingo_l3.png");
    // . ,down 1.3
    private final GreenfootImage s1 = new GreenfootImage("Flamingo_r1.png");
    private final GreenfootImage s2 = new GreenfootImage("Flamingo_r2.png");
    private final GreenfootImage s3 = new GreenfootImage("Flamingo_r3.png");
    // > ,right
    private final GreenfootImage d1 = new GreenfootImage("Flamingo_r1.png");
    private final GreenfootImage d2 = new GreenfootImage("Flamingo_r2.png");
    private final GreenfootImage d3 = new GreenfootImage("Flamingo_r3.png");
    
    public Bird()
    {
        setImage(s1);
        walking = false;
        walkLeft = false;
        walkRight = false;
    }
    
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkFall();
        platformAbove();
        checkKeys();
        checkRightWalls();
        checkLeftWalls();
        
        checkApple();
        checkMush();
        
        
        // walking();
    }
    
    public boolean conMove(){
        //return true;
        if(getX() <= 33 || getX() >= getWorld().getWidth() - 33){
            return false;
        }else if(getY() <= 33 || getY() >= getWorld().getHeight() - 33){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void walking(){
       if (Greenfoot.isKeyDown("up")){      
            setRotation(0);    
            setLocation(getX(),getY() - 5);
            //checkObstacle2();
        }
       if (Greenfoot.isKeyDown("down")){           
           setRotation(180);    
           setLocation(getX(),getY() + 5);
           //checkObstacle2();
        }
       if (Greenfoot.isKeyDown("left")){
            
           setRotation(270);   
           setLocation(getX() - 5,getY());
           //checkObstacle2();
        }
       if (Greenfoot.isKeyDown("right")){
           
           setRotation(90);    
           setLocation(getX() + 5,getY());
           //checkObstacle2();
        }
               
    }
    
    public boolean checkRightWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/2);
        Actor treeR = getOneObjectAtOffset(xDistance, 0, Tree.class);
        if(treeR == null)
        {
            return false;
        }
        else
        {
            stopByRightWall(treeR);
            return true;
        }
    }

    public void stopByRightWall(Actor treeR)
    {
        int wallWidth = treeR.getImage().getWidth();
        int newX = treeR.getX() - (wallWidth + getImage().getWidth())/2;
        setLocation(newX - 5, getY());

    }

    public boolean checkLeftWalls()
    {
        int spriteWidth = getImage().getWidth();
        int xDistance = (int)(spriteWidth/-2);
        Actor treeL = getOneObjectAtOffset(xDistance, 0, Tree.class);
        if(treeL == null)
        {
            return false;
        }
        else
        {
            stopByLeftWall(treeL);
            return true;
        }
    }

    public void stopByLeftWall(Actor treeL)
    {
        int wallWidth = treeL.getImage().getWidth();
        int newX = treeL.getX() + (wallWidth + getImage().getWidth())/2;
        setLocation(newX + 5, getY());
    }
    
     public void bopHead(Actor tree)
    {
        int treeHeight = tree.getImage().getHeight();
        int newY = tree.getY() + (treeHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }
    
     public boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/2) + 5;
        Actor ground = getOneObjectAtOffset(0, getImage().getHeight()/2, Tree.class);
        if(ground == null)
        {
            return false;
        }
        else{
            moveToGround(ground);
            return true;
        }
    }
     
    public void moveToGround(Actor tree)
    {
        int groundHeight = tree.getImage().getHeight();
        int newY = tree.getY() - (groundHeight + getImage().getHeight())/2;
        setLocation(getX(), newY);
    }
    
    public boolean platformAbove()
    {
        int spriteHeight = getImage().getHeight();
        int yDistance = (int)(spriteHeight/-2);
        Actor tree = getOneObjectAtOffset(0, yDistance, Tree.class);
        if(tree != null)
        {
            bopHead(tree);
            return true;
        }
        else
        {
            return false;
        }
    }
    
     public void checkFall()
    {
        if(onGround())
        {
            speed = 3;
        }
    }
    
    public void checkApple()
    {
        Actor apple = getOneObjectAtOffset(0, 0, Apple.class);
        if(apple != null)
        {
            int appleX = apple.getX();
            int appleY = apple.getY();
            int thisX = this.getX(); 
            int thisY = this.getY();
            //Greenfoot.delay(2);
            //Dark dark = new Dark();
            //getWorld().addObject(dark,thisX,thisY);
            Greenfoot.playSound("scifi034.wav");
            End end = new End();
            Greenfoot.delay(5);
            Greenfoot.setWorld(end);        
        }
    }
    
     public void checkMush()
    {
        Actor mushroom = getOneObjectAtOffset(0,0,Mushroom.class);
        if(mushroom!=null)
        {
            getWorld().removeObject(mushroom);
            End end = new End();
            Greenfoot.delay(2);
            Greenfoot.setWorld(end);
        }
    }
    
     public void checkLetter()
    {
        Actor letter = getOneObjectAtOffset(0,0,Letter.class);
        if(letter!=null)
        {
            getWorld().removeObject(letter);
            End end = new End();
            Greenfoot.delay(2);
            Greenfoot.setWorld(end);
        }
    }
    
    // ///////////////////////////////////////////////////////// //
    
    public void isCount(){
        if(isTouching(Letter.class)){
            removeTouching(Letter.class);
            World myWorld = getWorld();
            World1 myworld = (World1)myWorld;
            Count counter = myworld.getCount();
            counter.addScore();
            getWorld().removeObject(this);
            
            
        }
    }
    
     public void checkKeys()
    {
        if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("up"))
        {
            walkUp();
            setLocation(getX(),getY()-speed);
            isKeyPressed = true;
        }
        if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("down"))
        {
            walkDown();
            setLocation(getX(),getY()+speed);
            isKeyPressed = true;
        }
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("left"))
        {
            walkLeft();
            setLocation(getX()-speed,getY());
            isKeyPressed = true;
        }
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("right"))
        {
            walkRight();
            setLocation(getX()+speed,getY());
            isKeyPressed = true;
        }
         if(!(isKeyPressed))
        {
            stopWalking();
        }
        //Greenfoot.playSound("night2.wav");
    }
    
    public void walkUp()
    {
        walking = true;
        frame++;
        if(frame==1)
        {
            setImage(w1);
        }
        else if(frame==2)
        {
            setImage(w1);
        }
        else if(frame==3)
        {
            setImage(w1);
            frame = 1;
            return;
        }
    }
    
    public void walkLeft()
    {
        walking = true;
        frame++;
        if(frame==1)
        {
            setImage(a1);
        }
        else if(frame==2)
        {
            setImage(a2);
        }
        else if(frame==3)
        {
            setImage(a3);
            frame = 1;
            return;
        }
    }
    
    public void walkDown()
    {
        walking = true;
        frame++;
        if(frame==1)
        {
            setImage(s1);
        }
        else if(frame==2)
        {
            setImage(s1);
        }
        else if(frame==3)
        {
            setImage(s1); 
            frame = 1;
            return;
        }
    }
    
    public void walkRight()
    {
        walking = true;
        frame++;
        if(frame==1)
        {
            setImage(d1);
        }
        else if(frame==2)
        {
            setImage(d2);
        }
        else if(frame==3)
        {
            setImage(d3);
            frame = 1;
            return;
        }
    }
    
    public void stopWalking()
    {
        walking = false;
    }
    
    
}
