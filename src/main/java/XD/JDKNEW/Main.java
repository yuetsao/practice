package XD.JDKNEW;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
//        Student student = null;

//        Optional<Student> optionalStudent = Optional.of(student);
//        Student student1 = Optional.ofNullable(new Student()).orElse(student);
//        int age = Optional.ofNullable(student).map(e -> e.getAge()).orElse(7);
//        System.out.println(age);

//        if(student1.isPresent()) {
//            System.out.println(optionalStudent1.get());
//        }else {
//            System.out.println("kong");
//        }
//        new Thread(()-> System.out.println("java8")).start();
//
//        List<String> list = Arrays.asList("a", "d", "c");
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println(list);
//        Collections.sort(list, (a, b) -> a.compareTo(b));
//        System.out.println(list);

        System.out.println(operator(20, 5, (x,y) -> x+y));
        Function<Integer, Integer> function = p -> p*10;
        System.out.println(function.apply(10));

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a*b;
        System.out.println(biFunction.apply(10, 100));

        Consumer<Integer> consumer = a -> System.out.println(a);
        consumer.accept(10);

        List<String> list = Arrays.asList("aa", "bb", "abb", "acc");

        System.out.println(filter(list, obj -> obj.startsWith("a")));

        //使用双冒号来构造非晶态函数引用
        Function<String, Integer> function1 = Integer::parseInt;

        Integer val = function1.apply("1024");
        System.out.println(val);

        List<String> aa = list.stream().map(obj -> "aaaaaa" + obj).collect(Collectors.toList());
        System.out.println(aa);

        for(int i =0; i<10; i++) {
            List<Integer> list1 = new CopyOnWriteArrayList<>();
            IntStream.range(0, 100).parallel().forEach(list1::add);
            System.out.println(list1.size());
        }

        Generic<String> generic = new Generic<>("a");
        System.out.println(generic.getKey());



    }

    public static Integer operator(Integer x, Integer y, OperFunction<Integer, Integer> of) {
        return of.operator(x, y);
    }

    public static List<String> filter(List<String> list, Predicate<String> predicate) {
        List<String> results = new ArrayList<>();
        for(String str: list) {
            if(predicate.test(str)) {
                results.add(str);
            }
        }
        return results;
    }


}
