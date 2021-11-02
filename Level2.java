import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private final int SPEED = 3;
    private final float GRAVITY = 0.0667f;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 710, 1); 
        Floor floor = new Floor();
        addObject(floor,600,800);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Coral coral = new Coral();
        addObject(coral,515,664);
        Coral coral2 = new Coral();
        addObject(coral2,844,506);
        Coral coral3 = new Coral();
        addObject(coral3,351,373);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY,MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player, 55, 693);
        player.setLocation(55,660);
        coral.setLocation(344,521);
        coral2.setLocation(871,335);
        coral3.setLocation(397,375);
        removeObject(coral3);
        Door door = new Door();
        addObject(door,324,119);
        Health health2 = new Health();
        addObject(health2,23,20);
        Health health3 = new Health();
        addObject(health3,56,20);
        Health health4 = new Health();
        addObject(health4,89,20);
        Greenfoot.playSound("zapsplat_024.mp3");
    }
}
