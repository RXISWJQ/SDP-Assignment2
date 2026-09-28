package factorymethod;

public class Skeleton implements Enemy {
    @Override
    public void attack() {
        System.out.println("Skeleton shoots an arrow from a bow!");
    }
}