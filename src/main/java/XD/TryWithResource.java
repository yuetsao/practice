package XD;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TryWithResource {
    public static void main(String[] args) {
        copyText();
    }

    /**
     * jdk7后的写法，jdk9进行了改良，变化不大 只要实现了java.io.Closeable 就可以自动被关闭， try（）可以定义多个资源
     * 他们的关闭顺序是最后在try里面定义的最新关闭
     */
    public static void copyText() {
        try (
                /**流的相关操作**/
                FileInputStream fis = new FileInputStream("/Users/caoyue/Desktop/test.txt");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("/Users/caoyue/Desktop/copy.txt");
                BufferedOutputStream bos = new BufferedOutputStream(fos);
        ){
            /**业务逻辑**/
            int size;
            byte [] buf = new byte[1024];
            while ((size = bis.read(buf))!=-1) {
                bos.write(buf, 0, size);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
