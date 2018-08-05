import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bug bug = new bug();
        addObject(bug,85,181);
        cheese cheese = new cheese();
        addObject(cheese,259,34);
        cheese cheese2 = new cheese();
        addObject(cheese2,357,218);
        cheese cheese3 = new cheese();
        addObject(cheese3,199,344);
        cheese cheese4 = new cheese();
        addObject(cheese4,538,54);
        cheese cheese5 = new cheese();
        addObject(cheese5,536,352);
        cheese cheese6 = new cheese();
        addObject(cheese6,34,24);
        cheese cheese7 = new cheese();
        addObject(cheese7,32,383);
        cheese cheese8 = new cheese();
        addObject(cheese8,400,384);
        cheese cheese9 = new cheese();
        addObject(cheese9,588,199);
        cheese cheese10 = new cheese();
        addObject(cheese10,144,93);
        frog frog = new frog();
        addObject(frog,134,361);
    }
}
