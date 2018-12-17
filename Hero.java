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
    boolean coinGold= false;
    boolean coinSilver= false;
    int x = 84;
    int y = 973;
    boolean Key2;
    public int frame = 0;

    public static int score=0;

    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
        getImage().scale(55, 70);                               
    }

    @Override
    public void act() {
        handleInput();
        lava();
        water();
        lava2();
        eatKey();
        eatcoinGold();
        eatCoinSilver();
        tile();
        doortile();
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();
        handleInput();
        for (Actor enemy : getIntersectingObjects(Enemy.class)) {
            if (enemy != null) {
                setLocation(x,y);
                break;
            }
        }
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("up") && (onGround() == true)) {
            //for(Actor Hero : getIntersectingObjects(Tile.class)){
                velocityY = -15;
                

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
        Actor under = getOneObjectAtOffset(0, getImage().getHeight()*3/4, Tile.class);
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
  public boolean eatKey()

    {
        for(Actor key : getIntersectingObjects(Key2.class))

        {
            if(isTouching(Key2.class))

            {
                removeTouching(Key2.class);
                Key2= true;
                break;
            }
        }
        return Key2;
    }
  public boolean eatKeys()

    {
        for(Actor key : getIntersectingObjects(Key3.class))

        {
            if(isTouching(Key3.class))

            {
                removeTouching(Key3.class);
                Key2= true;
                break;
            }
        }
        return Key2;
    }
  public void tile()

    {
      if(isTouching(DoorTile.class))

      {

          Greenfoot.setWorld(new World2());

    

        }
    }
  public void doortile()

    {

      if(isTouching(DoorTop.class))

      {

          Greenfoot.setWorld(new World3());

    

        }

    }  
  public boolean eatcoinGold()

    {
        for(Actor coinGolder : getIntersectingObjects(coinGoldTile.class))

        {
            if(isTouching(coinGoldTile.class))

            {
                removeTouching(coinGoldTile.class);
                coinGold= true;
                break;
            }
        }
        return coinGold;
    }
  public boolean eatCoinSilver()

    {
        for(Actor coinSilver1 : getIntersectingObjects(coinSilverTile.class))

        {
            if(isTouching(coinSilverTile.class))

            {
                removeTouching(coinSilverTile.class);
                coinSilver= true;
                break;
            }
        }
        return coinGold;
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
            getImage().scale(55, 70);
        }
        else if(frame == 2)
        {
            setImage("p1_walk02.png");
            getImage().scale(55, 70);
        }
        else if(frame == 3)
        {
            setImage("p1_walk03.png");
            getImage().scale(55, 70);
        }
        else if(frame == 4)
        {
            setImage("p1_walk04.png");
            getImage().scale(55, 70);
        }
        else if(frame == 5)
        {
            setImage("p1_walk05.png");
            getImage().scale(55, 70);
        }
        else if(frame == 6)
        {
            setImage("p1_walk06.png");
            getImage().scale(55, 70);
        }
        else if(frame == 7)
        {
            setImage("p1_walk07.png");
            getImage().scale(55, 70);
        }
        else if(frame == 8)
        {
            setImage("p1_walk08.png");
            getImage().scale(55, 70);
        }
        else if(frame == 9)
        {
            setImage("p1_walk09.png");
            getImage().scale(55, 70);
        }
        else if(frame == 10)
        {
            setImage("p1_walk10.png");
            getImage().scale(55, 70);
        }
        else if(frame == 11)
        {
            setImage("p1_walk11.png");
            getImage().scale(55, 70);
            frame = 0;
            return;
            
        }
        frame++;
    }
  public void animatieLeft()
    {
        if(frame == 1)
        {
            setImage("p1_walk010.png");
            getImage().scale(55, 70);
        }
        else if(frame == 2)
        {
            setImage("p1_walk020.png");
            getImage().scale(55, 70);
        }
        else if(frame == 3)
        {
            setImage("p1_walk030.png");
            getImage().scale(55, 70);
        }
        else if(frame == 4)
        {
            setImage("p1_walk040.png");
            getImage().scale(55, 70);
        }
        else if(frame == 5)
        {
            setImage("p1_walk050.png");
            getImage().scale(55, 70);
        }
        else if(frame == 6)
        {
            setImage("p1_walk060.png");
            getImage ().scale(55, 70);
        }
        else if(frame == 7)
        {
            setImage("p1_walk070.png");
            getImage().scale(55, 70);
        }
        else if(frame == 8)
        {
            setImage("p1_walk080.png");
            getImage().scale(55, 70);
        }
        else if(frame == 9)
        {
            setImage("p1_walk090.png");
            getImage().scale(55, 70);
        }
        else if(frame == 10)
        {
            setImage("p1_walk100.png");
            getImage().scale(55, 70);
        }
        else if(frame == 11)
        {
            setImage("p1_walk110.png");
            getImage().scale(55, 70);
            frame = 0;
            return;
        }
        frame++;
        
        
    }
}
