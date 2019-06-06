package testsub;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caoyue
 * @description
 * @date 2019-06-05 14:57
 **/
public class Testsub {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>(list1);
        List<Integer> list3 = list1.subList(0, list1.size());

        list3.add(3);

        System.out.println("list1 == list2:" + list1.equals(list2));
        System.out.println("list1 == list3:" + list1.equals(list3));
        System.out.println(list3);
        System.out.println(list1);
    }
}
