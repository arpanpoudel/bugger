import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bug extends Actor
{
    /**
     * Act - do whatever the bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int score=0;
    private int speed=2;
    public void act() 
    {
       
        mover(speed); //call moving method
        eatcake(); //call cake eat method
        
    } 
    public void mover(int speed) //moving method definition
    {
        if(Greenfoot.isKeyDown("Up") || Greenfoot.isKeyDown("W"))
        {
            setLocation(getX(),getY()-speed);
            turn(3);
        }
        if(Greenfoot.isKeyDown("Down") || Greenfoot.isKeyDown("S"))
        {
            setLocation(getX(),getY()+speed);
            turn(-3);
        }
         if(Greenfoot.isKeyDown("Left") || Greenfoot.isKeyDown("A"))
        {
            setLocation(getX()-speed,getY());
            turn(3);
        }
        if(Greenfoot.isKeyDown("Right") || Greenfoot.isKeyDown("D"))
        {
            setLocation(getX()+speed,getY());
            turn(-3);
        }
    }
    public void eatcake() //delete eaten cheese
    {
        if(isTouching(cheese.class)){
            removeTouching(cheese.class);
            score=score+1;
            Greenfoot.playSound("hit.wav");
            getWorld().showText("Score:"+score,100,30);
            //add new enimies for higher score
            if(score==3){
                frog froggy= new frog();
                getWorld().addObject(froggy,00,00);
                speed=speed+1;
               
            }
            if(score==5){
                frog froggy= new frog();
                getWorld().addObject(froggy,00,00);
                speed=speed+1;
            }
            if(score==6){
                frog froggy= new frog();
                getWorld().addObject(froggy,00,00);
                speed=speed+1;
                
            }
            if(score==7){
                frog froggy= new frog();
                getWorld().addObject(froggy,00,00);
                
            }
            if(score==8){
                frog froggy= new frog();
                getWorld().addObject(froggy,00,00);
                
            }
            if(score==10){
                getWorld().showText("Winner Winner Chicken Dinner!",300,200);
                Greenfoot.playSound("win.wav");
            Greenfoot.stop();
                }
                
                
        }
        
    }
    
}
