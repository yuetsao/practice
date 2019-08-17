package transienttest;

import java.io.*;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-06-24 11:20
 **/
public class TransientTest {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("Alexia");
        user.setPassword("123456");

        System.out.println("read before Serivaliazable");
        System.out.println("username" + user.getUsername());
        System.out.println("password" + user.getPassword());

        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream("/Users/caoyue/Desktop/user.txt"));
            os.writeObject(user); // 将User对象写进文件
            os.flush();
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(
                    "C:/user.txt"));
            user = (User) is.readObject(); // 从流中读取User的数据
            is.close();

            System.out.println("\nread after Serializable: ");
            System.out.println("username: " + user.getUsername());
            System.err.println("password: " + user.getPassword());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class User implements Serializable {
    private static final long serialVersionUID = 8294180014912103005L;
    private String username;
    private transient String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
