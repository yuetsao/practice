package nio;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 1通道（Channel）：用于源节点与目标节点的连接。在java NIO中负责缓冲区中的数据传输。Channel本身不存储数据，因此需要配合缓冲区进行传输
 * 2通道的主要实现类
 *  java.nio.chanels.Channel接口
 *    |-- FileChannel
 *    |-- SocketChannel
 *    |-- ServerSocketChannel
 *    |-- DatagramChannel
 * 3获取通道
 *   java针对支持通道的类提供了getChannel（）方法
 *    本地io操作
 *    FileInputStream/FileOutputStream
 *    RandomAccessFile
 *    网络Io：
 *    Socket
 *    ServerSocket
 *    DatagramSocket
 *  在jdk1。7 中nio2针对各个通道提供了静态方法open
 *                     Files工具类的newByteChannel（）
 *
 *
 *
 *
 */
public class TestChannel {

    @Test
    public void test1()  throws Exception{
        //1.利用通道完成文件的复制
        FileInputStream fis = new FileInputStream("1.jpg");
        FileOutputStream fos = new FileOutputStream("2.jpg");

        //获取通道
        FileChannel inChannel = fis.getChannel();
        FileChannel outChannel = fos.getChannel();

        //分配指定大小的缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);

        //将通道中的数据存入缓冲区
        while(inChannel.read(buf) != -1) {
            buf.flip();
            outChannel.write(buf);
            buf.clear();
        }
        outChannel.close();
        inChannel.close();
        fos.close();
        fis.close();
        //将缓冲区中的数据写入通道中
    }


}
