package XD.JDKNEW;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

public class Dog implements Animal {

    @Override
    public void run() {
        System.out.println("狗跑步");
    }

    @Override
    public void eat() {
        System.out.println("狗吃");
    }

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.run();
//        dog.eat();
//        dog.breath();
//        BASE64Decoder  decoder = new BASE64Decoder();
//        BASE64Encoder encoder = new BASE64Encoder();
//
//        String text = "yuetsao";
//        byte [] textByte = text.getBytes(StandardCharsets.UTF_8);
//        String encodeText = encoder.encode(textByte);
//
//        Base64.Encoder encoder1= Base64.getEncoder();
//        Base64.Decoder decoder1 = Base64.getDecoder();
//
//        System.out.println(encodeText);
//        try {
//            System.out.println(new String(decoder.decodeBuffer(encodeText), "UTF-8" ));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfMonth());

        //加减年份
        LocalDate nextYear = localDate.plusYears(1);
        System.out.println(nextYear.getYear());

        //日期比较
        System.out.println("isAfter:" + nextYear.isAfter(localDate));

        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDateTime localDateTime1 = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String ldtStr = dtf.format(localDateTime1);
        System.out.println(ldtStr);

        LocalDateTime changeDate = LocalDateTime.of(2020, 11, 11, 8,20,30);
        System.out.println(changeDate);

        Duration duration = Duration.between(localDateTime1, changeDate);
        System.out.println(duration.toDays());


    }
}
