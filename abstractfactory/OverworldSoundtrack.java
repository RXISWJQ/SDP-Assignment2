package abstractfactory;

public class OverworldSoundtrack implements Soundtrack {
    @Override
    public void play() {
        System.out.println("Playing Minecraft calm background music (C418 - Sweden).");
    }
}