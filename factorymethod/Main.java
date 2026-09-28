package factorymethod;

public class Main {
    public static void main(String[] args) {
        EnemySpawner spawner = new ZombieSpawner();
        spawner.spawnAndAttack();

        spawner = new CreeperSpawner();
        spawner.spawnAndAttack();
    }
}