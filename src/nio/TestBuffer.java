package nio;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * 直接缓冲区与非直接缓冲区
 *
 */

public class TestBuffer {

    @Test
    public void test1() {
        String str = "abcded";
        //1.分配一个指定大小的缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //2.利用put存放数据
        buf.put(str.getBytes());
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //3。切换到读取数据的模式
        buf.flip();
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //4 读取
        byte[] dst = new byte[buf.limit()];
        buf.get(dst);
        System.out.println(new String (dst, 0, dst.length));

        //5 rwind() 可以重复读数据
        buf.rewind();
        //6 clear（） 清空缓冲区 缓冲区的数据依然存在，但是处于"被遗忘"状态
        buf.clear();
        // 7 mark 和 reset ：恢复到mark的位置
        // 8 hasRemaining 可以操作的数据（剩余）


    }

}
