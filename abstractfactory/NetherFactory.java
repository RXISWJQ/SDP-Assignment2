package abstractfactory;

public class NetherFactory implements BiomeFactory {
    @Override
    public Enemy createEnemy() {
        return new NetherPiglin();
    }

    @Override
    public Terrain createTerrain() {
        return new NetherrackTerrain();
    }

    @Override
    public Soundtrack createSoundtrack() {
        return new NetherSoundtrack();
    }
}