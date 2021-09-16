
import greenfoot.*;

/**
 * 
 */
public class Human extends Actor
{

    /**
     * Act - do whatever the human wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */  
    
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }
    
    private void turnAtEdge ()
    { 
        if (isAtEdge())
        {
            turn(50);
        } 
    } 
    
    private void checkKeyPress ()
    {
        if(Greenfoot.isKeyDown("right"))
        {
            turn(4);            
        }
    
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-4);
        }
    }
    
    private void onCollision( )
    {
        if(isTouching(Island.class))
        {
            Greenfoot.setWorld(new youwin());
            Greenfoot.stop();
        }
         
        if(isTouching(Bomb.class))
        {
            Greenfoot.setWorld(new lose());
            Greenfoot.stop();
        }
        
        if(isTouching(Whale.class))
        {
            Greenfoot.setWorld(new lose());
            Greenfoot.stop();
        }
    }
}
    

    
   



    
