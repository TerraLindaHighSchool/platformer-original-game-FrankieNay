import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 710, 1, false); 
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
        addObject(floor,600,710);
        addObject(new Bomb(GRAVITY), 1050, 670);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY,MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player, 55, 300);
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(smBrickWall,585,644);
        BrickWall brickWall = new BrickWall();
        addObject(brickWall,961,482);
        SmBrickWall smBrickWall2 = new SmBrickWall();
        addObject(smBrickWall2,451,325);
        SmBrickWall smBrickWall3 = new SmBrickWall();
        addObject(smBrickWall3,160,190);
        BrickWall brickWall2 = new BrickWall();
        addObject(brickWall2,730,108);
        SmBrickWall smBrickWall4 = new SmBrickWall();
        addObject(smBrickWall4,1143,103);
        smBrickWall4.setLocation(1144,100);
        brickWall2.setLocation(916,102);
        brickWall2.setLocation(915,93);
        brickWall2.setLocation(669,92);
        brickWall2.setLocation(685,87);
        brickWall2.setLocation(744,97);
        brickWall2.setLocation(685,100);
        brickWall2.setLocation(826,159);
        smBrickWall4.setLocation(1115,156);
        door.setLocation(1165,113);
        smBrickWall4.setLocation(1143,168);
        brickWall2.setLocation(695,176);
        smBrickWall4.setLocation(1160,181);
        smBrickWall4.setLocation(1122,176);
        smBrickWall4.setLocation(1122,176);
        door.setLocation(1158,140);
        door.setLocation(1147,86);
        door.setLocation(1190,111);
        door.setLocation(1157,124);
        door.setLocation(1169,123);
        door.setLocation(1165,108);
        door.setLocation(1168,139);
        door.setLocation(1169,134);
        door.setLocation(1160,133);
        door.setLocation(1149,142);
        door.setLocation(1147,113);
        door.setLocation(1160,128);
        player.setLocation(55,660);
    }
    
    public void act()
    {
        spawn();
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0050)
        {
            addObject(new Bomb(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }


        private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
}
