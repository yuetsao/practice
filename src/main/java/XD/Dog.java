package XD;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Dog implements Animal{
    public static void main(String[] args) {
        Animal.breath();
        List<Animal> vectorList = new Vector<>();
        vectorList.add(new Animal() {
        });
        Collections.synchronizedList(vectorList);
        List<Animal> copyList = new CopyOnWriteArrayList<>();
    }
}
