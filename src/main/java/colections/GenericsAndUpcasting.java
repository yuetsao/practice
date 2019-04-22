package colections;

import java.util.ArrayList;

class Apple{}
class GrannySmith extends Apple {}
class Fuji extends Apple{}
class Gala extends Apple{}
class Braeburn extends Apple{}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        apples.add(new GrannySmith());
        apples.add(new Fuji());
        apples.add(new Gala());
        apples.add(new Braeburn());
        for(Apple apple: apples) {
            System.out.println(apple);
        }
    }
}
