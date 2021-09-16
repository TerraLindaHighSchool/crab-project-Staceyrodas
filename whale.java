
import greenfoot.*;

/**
 * 
 */
public class Whale extends Actor
{

    /**
     * Act - do whatever the whale wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {      
        move(3);
        turnAtEdge();
        
    }
    
      
    private void turnAtEdge ()
    { 
        if (isAtEdge())
        {
            turn(50);
        } 
}

}
