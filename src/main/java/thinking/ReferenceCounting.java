package thinking;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter ++;
    public Shared () {
        System.out.println("Creating " + this);
    }
    public void addRef() {
        refcount ++;
    }
    public void dispose () {
        if(--refcount==0) {
            System.out.println("dispose"+this);
        }
    }
    public String toString () {
        return "shared" + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter =0;
    private final long id = counter ++;
    public Composing(Shared shared) {
        System.out.println("creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose () {
        System.out.println("disposing " + this);
        shared.dispose();
    }
    public String toString () {return "composing " + id;}
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing [] composings = {new Composing(shared),new Composing(shared),
        new Composing(shared),new Composing(shared)};
        for(Composing composing: composings) {
            composing.dispose();
        }
    }
}
