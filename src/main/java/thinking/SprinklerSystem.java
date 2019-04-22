package thinking;

class WarerSource {
    private String s;
    WarerSource() {
        System.out.println("thinking.WarerSource()");
        s = "Constructed";
    }
    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String val1, val2,val3,val4;
    private WarerSource warerSource = new WarerSource();
    private int i;
    private float f;
    public String toString() {
        return "val1=" + val1 + "\n"+
               "val2=" + val2 + "\n"+
               "val3=" + val3 + "\n"+
               "val4=" + val4 + "\n"+
                "i="   + i    + "\n"+
                "f="   + f    + "\n"+
                "warerSource=" + warerSource;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}


