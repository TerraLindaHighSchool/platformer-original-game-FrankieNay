import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Door door = new Door();
        addObject(door,1175,42);
        Floor floor = new Floor();
        addObject(floor,600,800);
        addObject(new Bomb(GRAVITY), 1050, 765);
        Player player = new Player(3, 5.6f, GRAVITY, 3, 3, Level2.class, MUSIC);
    }
        private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
}
