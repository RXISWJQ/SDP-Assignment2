package abstractfactory;

public class GrassTerrain implements Terrain {
    @Override
    public void render() {
        System.out.println("Rendering Grass blocks and Oak trees.");
    }
}