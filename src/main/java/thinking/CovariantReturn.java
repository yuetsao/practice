package thinking;

class Grain {
    public String toString() {
        return "thinking.Grain";
    }
}
class Wheat extends Grain {
    public String toString() {
        return "thinking.Wheat";
    }
}
class Mill {
//  thinking.Grain process () {
    private Grain process () {
        return new Grain();
    }
}
class WheatMill extends Mill {
     Wheat process() {
        return new Wheat();
    }
}
public class CovariantReturn {
    public static void main(String[] args) {
        Mill mill = new Mill();
//        thinking.Grain grain = mill.process();
//        System.out.println(grain);
        mill = new WheatMill();
//        grain = mill.process();
//        System.out.println(grain);
    }
}
