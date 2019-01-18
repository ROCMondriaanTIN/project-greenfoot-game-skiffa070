import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**

 * Write a description of class TitleScreen here.

 * 

 * @author (your name) 

 * @version (a version number or a date)

 */

public class TitleScreen extends World

{



    private int counter;

    

    public TitleScreen()

    {    

        super(1280, 720, 1);

        Greenfoot.start();

        this.setBackground("titlescreen.jpg");

    }



    

    public void act()

    {

        if (Greenfoot.isKeyDown("enter")) 

        {

            Greenfoot.setWorld(new World1());

    }

}

}