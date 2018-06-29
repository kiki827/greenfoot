package garden;

import greenfoot.Actor;
import greenfoot.World;
import jankenanimal.JankenAnimal;

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
        Actor a2=new JankenAnimal(500,200);
        addObject(a2,400,200);

        Actor a1=new JankenAnimal(190,200);
        addObject(a1,0,200);


    }



}