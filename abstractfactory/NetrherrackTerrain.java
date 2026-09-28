package abstractfactory;

public class NetherrackTerrain implements Terrain {
    @Override
    public void render() {
        System.out.println("Rendering Netherrack blocks and Lava falls.");
    }
}