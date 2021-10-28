import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private final int SPEED = 3;
    private final float GRAVITY = 0.0667f;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level1.class;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        super(1200, 710, 1); 
        Floor floor = new Floor();
        addObject(floor,600,800);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY,MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player, 55, 693);
        player.setLocation(55,660);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Umbrella umbrella = new Umbrella();
        addObject(umbrella,792,560);
        Umbrella umbrella2 = new Umbrella();
        addObject(umbrella2,1070,354);
        Umbrella umbrella3 = new Umbrella();
        addObject(umbrella3,766,245);
        umbrella2.setLocation(1052,392);
        Umbrella umbrella4 = new Umbrella();
        addObject(umbrella4,124,389);
        umbrella3.setLocation(881,237);
        umbrella2.setLocation(1078,390);
        umbrella.setLocation(879,555);
        Door door = new Door();
        addObject(door,77,324);
    }
}
