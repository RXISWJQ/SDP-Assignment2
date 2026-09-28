package factorymethod;

public class CreeperSpawner extends EnemySpawner {
    @Override
    public Enemy createEnemy() {
        return new Creeper();
    }
}