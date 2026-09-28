package factorymethod;

public class ZombieSpawner extends EnemySpawner {
    @Override
    public Enemy createEnemy() {
        return new Zombie();
    }
}