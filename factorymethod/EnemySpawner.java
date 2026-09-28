package factorymethod;

public abstract class EnemySpawner {
    public abstract Enemy createEnemy();

    public void spawnAndAttack() {
        Enemy enemy = createEnemy();
        enemy.attack();
    }
}