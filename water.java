// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class water extends World
{

    /**
     * Constructor for objects of class water.
     */
    public water()
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
        human human =  new human();
        addObject(human, 328, 198);
        whale whale =  new whale();
        addObject(whale, 109, 83);
        island island =  new island();
        addObject(island, 578, 374);
        island island2 =  new island();
        addObject(island2, 29, 16);
        island island3 =  new island();
        addObject(island3, 577, 326);
        island island4 =  new island();
        addObject(island4, 523, 370);
        island island5 =  new island();
        addObject(island5, 63, 16);
        island3.setLocation(27, 55);
        island4.setLocation(528, 376);
        island.setLocation(566, 382);
        island4.setLocation(547, 380);
        island island6 =  new island();
        addObject(island6, 576, 342);
        island6.setLocation(584, 332);
        island.setLocation(591, 380);
        island6.setLocation(580, 344);
        island4.setLocation(549, 373);
        island2.setLocation(24, 7);
        island5.setLocation(49, 9);
        island3.setLocation(18, 36);
        island island7 =  new island();
        addObject(island7, 551, 348);
        island island8 =  new island();
        addObject(island8, 62, 38);
        island3.setLocation(29, 28);
        island2.setLocation(25, 28);
        island8.setLocation(53, 36);
        island.setLocation(582, 372);
        island2.setLocation(7, 56);
        island2.setLocation(3, 10);
        island3.setLocation(12, 40);
        island3.setLocation(48, 38);
        island3.setLocation(3, 40);
        island2.setLocation(7, 18);
        island2.setLocation(51, 14);
        island2.setLocation(154, 40);
        island2.setLocation(141, 50);
        island2.setLocation(42, 18);
        island2.setLocation(39, 44);
        island8.setLocation(68, 24);
        island5.setLocation(62, 48);
        island3.setLocation(57, 81);
        island2.setLocation(36, 77);
        island8.setLocation(80, 26);
        island3.setLocation(65, 50);
        island3.setLocation(36, 56);
        island4.setLocation(535, 388);
        island.setLocation(564, 377);
        island4.setLocation(545, 378);
        island7.setLocation(536, 359);
        island6.setLocation(570, 356);
        island2.setLocation(50, 27);
        island5.setLocation(65, 29);
        island3.setLocation(33, 41);
        island3.setLocation(63, 41);
        bomb bomb =  new bomb();
        addObject(bomb, 484, 80);
        bomb bomb2 =  new bomb();
        addObject(bomb2, 455, 224);
        bomb2.setLocation(136, 277);
        bomb2.setLocation(138, 288);
        bomb bomb3 =  new bomb();
        addObject(bomb3, 286, 66);
        bomb.setLocation(557, 176);
        bomb2.setLocation(118, 320);
    }
}
