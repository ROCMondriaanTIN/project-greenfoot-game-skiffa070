
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    boolean inAir;
    int x = 84;
    int y = 973;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        lava();
        water();
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
        if (Greenfoot.isKeyDown("up")) {
            for(Actor Hero : getIntersectingObjects(Tile.class)){
                velocityY = -15;
                inAir = true;

            }

        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -6;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 6;
        }

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

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}

