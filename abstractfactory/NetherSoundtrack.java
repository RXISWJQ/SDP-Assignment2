package abstractfactory;

public class NetherSoundtrack implements Soundtrack {
    @Override
    public void play() {
        System.out.println("Playing eerie ambient sounds of the Nether.");
    }
}