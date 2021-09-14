// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        island island =  new  island();
        addObject(island, 560, 353);
        island island2 =  new  island();
        addObject(island2, 44, 31);
        bombs bombs =  new  bombs();
        addObject(bombs, 398, 70);
        bombs bombs2 =  new  bombs();
        addObject(bombs2, 104, 284);
        bombs bombs3 =  new  bombs();
        addObject(bombs3, 383, 259);
        human human =  new  human();
        addObject(human, 264, 153);
        whale whale =  new  whale();
        addObject(whale, 84, 129);
    }
}
