import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        turnAtEdge();
        turnRandomly();
    }
    
      
    private void turnAtEdge ()
    { 
        if (isAtEdge())
        {
            turn(50);
        } 
    }

    private void turnRandomly ()
    {
        turn(Greenfoot.getRandomNumber(10) - 5);
    }
}

