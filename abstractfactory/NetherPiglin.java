package abstractfactory;

public class NetherPiglin implements Enemy {
    @Override
    public void attack() {
        System.out.println("Nether Piglin attacks with a Golden Sword!");
    }
}