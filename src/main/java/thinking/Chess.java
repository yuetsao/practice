package thinking;

class Game {
    Game(int i) {
        System.out.println("thinking.Game()constructor");
    }
    public String testStr(int i, int j) {
        return null;
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("thinking.BoardGame() constructor");
    }
    @Override
    public String testStr(int i, int j) {
        return null;
    }
}

public class Chess extends BoardGame{
    Chess(int i) {
        super(i);
        System.out.println("thinking.Chess() constructor");
    }
    public static void main(String [] args) {
        int i = 0;
        Chess chess = new Chess(i);
    }
}