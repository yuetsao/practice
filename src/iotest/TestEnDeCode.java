package iotest;

import java.io.UnsupportedEncodingException;

public class TestEnDeCode {
    public static void main(String[] args) {
        String msg = "必须彻底明白，即使跟踪一万行代码，否则你的兴趣会越来越小";
        byte [] encodeByteArr = msg.getBytes();//这里是使用工程默认的编码  todo 为什么，怎么调用的工程中的编码，也就是idea怎样和这段代码进行交互的
        try {
            msg = new String(encodeByteArr, 0 , encodeByteArr.length, "UTF-8");//这里进行解码，也就是将字节码转成字符串
            System.out.println(msg);
            msg = new String(encodeByteArr, 0, encodeByteArr.length, "GBK");
            System.out.println(msg);
            msg = new String (encodeByteArr, 0, encodeByteArr.length-1, "UTF-8");
            System.out.println(msg);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }


}
