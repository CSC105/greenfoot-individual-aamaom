import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class World1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends World
  {
    // 0   1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16  17  18  19  20  21  
    Count counter = new Count();
    private int timer = 1800;
    Text timerText = new Text(); 
    private static GreenfootSound music = new GreenfootSound("night2.wav");
    
    String setTree[][] = {{"","","1","1","1","1","1","1", "","4","1","1","1","1","1","1","1","1", "","", "", "",},
                          {"", "", "", "", "", "", "", "", "", "", "1", "", "", "", "", "", "", "", "", "", "", "",},
                          {"", "", "", "", "", "", "", "", "", "", "1", "", "", "", "", "","4", "", "", "", "", "",},
                          {"1", "","1","1","3","2","1","1","1","1","1","1", "","1","1","1","1","1","1","1","1","1",},
                          {"1","","1","4", "", "", "1", "", "", "", "", "", "", "1", "", "", "", "", "", "", "","1",},
                          {"1", "","1", "", "", "","1", "", "", "", "", "", "", "1", "", "", "", "", "", "", "","1",},
                          {"1", "", "", "", "", "","1", "", "", "", "", "", "","1", "", "", "", "","1", "", "","1",},
                          {"1", "", "", "","1","1","1","1","1", "","1", "", "","1", "", "", "", "","1", "", "","1",},
                          {"1", "","4", "", "", "", "", "", "", "","1", "","1","1","4", "", "", "","1", "", "","1",},
                          {"1", "","1", "", "", "", "", "", "", "","1", "", "","1","4","1","1","1","1", "","2","3",},
                          {"1","2","3", "","1", "", "", "","1", "","1", "", "", "", "", "","1", "","1", "", "","1",},
                          {"1", "","1","1","1","1","1", "","1", "","1","1", "", "", "", "", "", "", "", "", "","1",},
                          {"1", "", "", "", "", "","1", "", "", "", "","1", "", "", "", "", "", "", "", "", "","1",},
                          {"", "", "", "", "","4","1", "", "", "", "","1", "", "","1","1", "2","3","1","1", "","3",},
                          {"", "","1","1","1","1","1","1","1","1", "", "", "", "","1", "", "", "", "", "", "","1",},
                          {"1", "", "", "", "", "", "", "", "","1", "", "", "","4","1","1","1", "","1", "", "", "",},
                          {"1", "", "", "", "", "", "", "","2","3", "","1","1","1","1", "", "","1","1","1", "", "",},
                         };
                       
                        
    /**
     * Constructor for objects of class World1.
     * 
     */
    public World1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 532, 1); // x,y
        setBackground("wallpaper_grass.png");
        setPaintOrder(Bird.class, Tree.class, Mushroom.class); 
        prepare();
        createWalls();
        apple();
        act();
   
    }
    
    public void act(){
      timer--;
      
      if (timer%60==0){
          timerText.setText("Time left: " + (timer/60));
      }
      
      if(timer == 0){
          End end = new End();
          Greenfoot.delay(5);
          Greenfoot.setWorld(end);
      }
      
      if (getObjects(Letter.class).isEmpty()) 
      {
        Win wi = new Win();
        Greenfoot.delay(8);
        Greenfoot.setWorld(wi);
      } 
  
     
    }
   
    public void prepare()
    {
        Bird bird = new Bird();
        addObject(bird,32,76);
        Mushroom mush = new Mushroom();
        addObject(mush,563,156);
        
        Letter let = new Letter();
        addObject(let,346,86);
        Letter let2 = new Letter();
        addObject(let2,36,443);
        Letter let3 = new Letter();
        addObject(let3,754,88);
        Letter let4 = new Letter();
        addObject(let4,308,504);
        Letter let5 = new Letter();
        addObject(let5,770,508);
        Letter let6 = new Letter();
        addObject(let6, 626,267); 
        
        addObject(counter, 44, 36);
        
        addObject(timerText, 722, 36);
        timerText.setText("Time left: " + (timer/60));
    }
    
    public void createWalls()
    {
        for(int i=0 ; i<setTree.length ; i++){
            for(int j=0 ; j<setTree[i].length ; j++){
                Tree tree = new Tree();
                if(setTree[i][j].equals("1")||setTree[i][j].equals("3")){
                    addObject(tree,(j*35)+36,(i*30)+33);
                }
            }
        }
    }
    
    public void apple()
    {
        for(int i=0 ; i<setTree.length ; i++){
            for(int j=0 ; j<setTree[i].length ; j++){
                Apple apple = new Apple();
                if(setTree[i][j].equals("4")){
                    addObject(apple,(j*35)+36,(i*30)+33);
                }
            }
        } 
    }
    
    public Count getCount(){
      return counter;     
    }
}
