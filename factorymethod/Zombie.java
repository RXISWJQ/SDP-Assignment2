package factorymethod;

public class Zombie implements Enemy {
    @Override
    public void attack() {
        System.out.println("Zombie bites and groans: Rrrgh!");
    }
}