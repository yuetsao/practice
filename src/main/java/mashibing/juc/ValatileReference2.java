package mashibing.juc;
/**
 * @Title: ValatileReference2
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/7/23 16:43
 * @最后修改人: caoyue
 * @最后修改时间: 2020/7/23 16:43
 * @company: shopin.net
 * @version: V1.0
 */

/**
 * @Auther: yuetsao
 * @Date: 2020/7/23 16:43
 * @Description:
 */
public class ValatileReference2 {
    private static class Data {
        int a, b;

        public Data(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    volatile static Data data;

    public static void main(String[] args) {
        Thread writer = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                data = new Data(i, i);
            }
        });

        Thread reader = new Thread(()->{
            while (data == null) {}
            int x = data.a;
            int y = data.b;
            if(x != y) {
                System.out.printf("a = %s, b=%s%n", x, y);
            }
        });

        reader.start();
        writer.start();

        try {
            reader.join();
            writer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }
}
