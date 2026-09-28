package abstractfactory;

public class OverworldFactory implements BiomeFactory {
    @Override
    public Enemy createEnemy() {
        return new OverworldZombie();
    }

    @Override
    public Terrain createTerrain() {
        return new GrassTerrain();
    }

    @Override
    public Soundtrack createSoundtrack() {
        return new OverworldSoundtrack();
    }
}