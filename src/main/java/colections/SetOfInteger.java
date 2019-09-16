package colections;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger {
    public static void main(String[] args) {
//        Random random = new Random(47);
//        Set<Integer> integers = new HashSet<Integer>();
//        for(int i=0; i<1000; i++) {
//            integers.add(random.nextInt(30));
//        }
//        System.out.println(integers);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
        Date date = null;
        try {
            date = format.parse("2018-11-01");
        } catch (ParseException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        long millis = date.getTime();
        System.out.println(millis);
    }
}
