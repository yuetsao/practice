
class Cleaner{
    private String s = "Cleaner";
    public void append(String a) {
        s += a;
    }
    public void dilute() {
        append("dilute()");
    }
    public void apply() {
        append("apply()");
    }
    public void scrub() {
        append("scrub()");
    }
    public String toString() {
        return s;
    }


}

public class Detergent {

}
