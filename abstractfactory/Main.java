package abstractfactory;

public class Main {
    private final Enemy enemy;
    private final Terrain terrain;
    private final Soundtrack soundtrack;

    public Main(BiomeFactory factory) {
        this.enemy = factory.createEnemy();
        this.terrain = factory.createTerrain();
        this.soundtrack = factory.createSoundtrack();
    }

    public void runWorld() {
        terrain.render();
        soundtrack.play();
        enemy.attack();
    }

    public static void main(String[] args) {
        BiomeFactory factory = new NetherFactory();
        Main minecraftWorld = new Main(factory);
        minecraftWorld.runWorld();
    }
}