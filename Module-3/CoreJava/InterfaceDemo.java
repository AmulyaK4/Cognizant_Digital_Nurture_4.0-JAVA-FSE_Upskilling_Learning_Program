interface Playable {
    void play();
}

class Violin implements Playable {
    public void play() {
        System.out.println("Playing Violin");
    }
}

class Drums implements Playable {
    public void play() {
        System.out.println("Playing Drums");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Playable violin = new Violin();
        Playable drums = new Drums();

        violin.play();
        drums.play();
    }
}

