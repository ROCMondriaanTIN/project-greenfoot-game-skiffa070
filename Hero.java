
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    boolean onGround;
    int x = 84;
    int y = 973;
    public int frame = 0;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()*3/4;
        int myNewWidth = (int)myImage.getWidth()*3/4;
        myImage.scale(myNewWidth, myNewHeight);
    }

    @Override
    public void act() {
        handleInput();
        lava();
        water();
        lava2();
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        handleInput();

        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                getWorld().removeObject(this);
                break;
            }
        }
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("up") && (onGround() == true)) {
            //for(Actor Hero : getIntersectingObjects(Tile.class)){
                velocityY = -15 ;
                

            //}

        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -6;
            animatieLeft();
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 6;
            animatieRight();
        }

    }
    
    boolean onGround() {
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()/2, Tile.class);
        return under != null;
    }
    

    public void lava(){
        for(Actor hero : getIntersectingObjects(lavaTile.class)){
            if(hero != null) {
                setLocation(x,y);
            }
        }
    }
    public void water(){
        for (Actor hero : getIntersectingObjects(waterTile.class)){
            if(hero != null) {
                setLocation(x,y);
            }
        }
    }
    public void lava2(){
        for (Actor hero : getIntersectingObjects(lavaTile2.class)){
            if (hero != null) {
                setLocation(x,y);
            }
        }
    }
    
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
    public void animatieRight()
    {
        if(frame == 1 )
        {
            setImage("p1_walk01.png");
            frame = 2;
        }
        else if(frame == 2)
        {
            setImage("p1_walk02.png");
            frame = 3;
        }
        else if(frame == 3)
        {
            setImage("p1_walk03.png");
            frame = 4;
        }
        else if(frame == 4)
        {
            setImage("p1_walk04.png");
            frame = 5;
        }
        else if(frame == 5)
        {
            setImage("p1_walk05.png");
            frame = 6;
        }
        else if(frame == 6)
        {
            setImage("p1_walk06.png");
            frame = 7;
        }
        else if(frame == 7)
        {
            setImage("p1_walk07.png");
            frame = 8;
        }
        else if(frame == 8)
        {
            setImage("p1_walk08.png");
            frame = 9;
        }
        else if(frame == 9)
        {
            setImage("p1_walk09.png");
            frame = 10;
        }
        else if(frame == 10)
        {
            setImage("p1_walk10.png");
            frame = 11;
        }
        else if(frame == 11)
        {
            setImage("p1_walk11.png");
            frame = 12;
            return;
            
        }
        frame++;
    }
    public void animatieLeft()
    {
        if(frame == 1)
        {
            setImage("p1_walk010.png");
            frame = 2;
        }
        else if(frame == 2)
        {
            setImage("p1_walk020.png");
            frame = 3;
        }
        else if(frame == 3)
        {
            setImage("p1_walk030.png");
            frame = 4;
        }
        else if(frame == 4)
        {
            setImage("p1_walk040.png");
            frame = 5;
        }
        else if(frame == 5)
        {
            setImage("p1_walk050.png");
            frame = 6;
        }
        else if(frame == 6)
        {
            setImage("p1_walk060.png");
            frame = 7;
        }
        else if(frame == 7)
        {
            setImage("p1_walk070.png");
            frame = 8;
        }
        else if(frame == 8)
        {
            setImage("p1_walk080.png");
            frame = 9;
        }
        else if(frame == 9)
        {
            setImage("p1_walk090.png");
            frame = 10;
        }
        else if(frame == 10)
        {
            setImage("p1_walk100.png");
            frame = 11;
        }
        else if(frame == 11)
        {
            setImage("p1_walk110.png");
            frame = 1;
            return;
        }
        frame++;
    }
}
