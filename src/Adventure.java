
interface CanFly {
    void fly();
}
interface CanFight {
    void fight();
}
interface CanSwim {
    void swim();
}
class ActionCharacter {
    public void fight(){
        System.out.println("I'am actioncharacter I'am fighting");
    }
}
class Hero extends ActionCharacter implements CanFight,CanFly,CanSwim {
    public void swim() {System.out.println("I'am Hero I'am swiming");}
    public void fly() {System.out.println("I'am Hero I'am flying");}
    public void fight() {System.out.println("I'am Hero I'am fighting");}
}
public class Adventure{
    public static void t(CanFight canFight) {
        canFight.fight();
    }
    public static void u(CanFly canFly) {
        canFly.fly();
    }
    public static void v(CanSwim canSwim) {
        canSwim.swim();
    }
    public static void w(ActionCharacter canFight) {
        canFight.fight();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        u(hero);
        v(hero);
        w(hero);
    }



}
