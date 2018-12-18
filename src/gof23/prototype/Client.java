package gof23.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Client {
    public static void main(String[] args) throws Exception{
        Sheep sheep = new Sheep("少利", new Date(19999992234L));
        System.out.println(sheep);
        System.out.println(sheep.getSname());
        Sheep sheep1 = (Sheep)sheep.clone();
        sheep1.setSname("多利");
        System.out.println(sheep1);
        System.out.println(sheep1.getSname());

        //利用序列化和反序列化深度clone
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(sheep);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep sheep2 =(Sheep) ois.readObject();


    }
}
