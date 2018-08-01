

 abstract class Actor {
    public void act () {}
}

class HappyActor extends Actor {
    public void act() {
        System.out.println("HappyActor acting");
    }
}

class SadActor extends Actor {
    public void act() {
        System.out.println("SadActor acting");
    }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() {
        actor = new SadActor();
    }
    public void perforPlay() {
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.perforPlay();
        stage.change();
        stage.perforPlay();
    }
}
