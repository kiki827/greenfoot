package garden;

import greenfoot.Actor;
import greenfoot.World;

public class Garden extends World
{

    /**
     * Constructor for objects of class Garden.
     *
     */
    public  Garden()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super("garden",600, 400, 1);


        Actor a1=new Fox(0,200);
        addObject(a1,0,200);

        Actor a2=new Fox(400,200);
        addObject(a2,400,200);
    }



}