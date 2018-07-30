
class Villain {
    private String name;
    protected void set(String nm) {
        name = nm;
    }
    public Villain(String name) {
        this.name = name;
    }
    public String toString () {
        return "I'm " + name;
    }
}


public class Orc extends Villain{
    private int orcNumber;
    public Orc(String name, int orcNumber) {
        super(name);
        this.orcNumber = orcNumber;
    }
    private void change(String name, int orcNumber) {
        set(name);
        this.orcNumber = orcNumber;
    }
    public String toString() {
        return "orcNumer" + orcNumber + super.toString();
    }
    public static void main(String args[] ) {
        Orc orc = new Orc("jim", 3);
        System.out.println(orc);
        orc.change("bob", 19);
        System.out.println(orc);
    }

}
