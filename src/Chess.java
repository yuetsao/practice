
class Game {
    Game(int i) {
        System.out.println("Game()constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame() constructor");
    }
}

public class Chess extends BoardGame{
    Chess(int i) {
        super(i);
        System.out.println("Chess() constructor");
    }
    public static void main(String [] args) {
        int i = 0;
        Chess chess = new Chess(i);
    }
}
