package abstractfactory;

public class OverworldZombie implements Enemy {
    @Override
    public void attack() {
        System.out.println("Overworld Zombie attacks in the dark!");
    }
}