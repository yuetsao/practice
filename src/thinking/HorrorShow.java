package thinking;

interface Monster {public void menace();}
//注意接口要用extends而不是implements因为接口毕竟不是实现（implement）
interface DanerousMonster extends Monster {public void destroy();}
interface Lethal {void kill();}
class DragonZilla implements DanerousMonster{
    public void menace() {}
    public void destroy() {}
}
interface Vampire extends DanerousMonster,Lethal {
    void drinkBlood();
}
class VeryBadVampire implements Vampire {
    public void kill () {}
    public void menace() {}
    public void destroy() {}
    public void drinkBlood() {}
}

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }
    static void v(DanerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DanerousMonster danerousMonster = new DragonZilla();
        u(danerousMonster);
        v(danerousMonster);
        Vampire vampire = new VeryBadVampire();
        u(vampire);
        v(vampire);
        w(vampire);
    }
}
