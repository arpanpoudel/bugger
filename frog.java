import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class frog extends Actor
{
    /**
     * Act - do whatever the frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 
    public void act() 
    {
        move(3);
        //adding random movement
        if(Greenfoot.getRandomNumber(150)<20){
            setLocation(getX()+Greenfoot.getRandomNumber(10)-5,
            getY()+Greenfoot.getRandomNumber(20)-5);
            turn(Greenfoot.getRandomNumber(15));
        }
        eatbug();
    }  
    public void eatbug() //delete  bug
    {
        if(isTouching(bug.class)){
            removeTouching(bug.class);
            getWorld().showText("Game Over",300,200);
            Greenfoot.playSound("gameover.mp3");
            Greenfoot.stop();
        }
    }
}
