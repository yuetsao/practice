package testJVM.loadclass;

/**
 * @ClassName WayToRun
 * @Description
 * @Author caoyue
 * @Date 2021/5/24 11:29 下午
 * @Version V1.0
 **/
public class WayToRun {
    public static void main(String[] args) {
        for (int i=0; i<10_0000; i++)
            m();
        long start = System.currentTimeMillis();
        for (int i=0; i<10_0000; i++)
            m();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void m() {
        for (int i = 0; i <10_0000L ; i++) {
            long j=i%3;
        }
    }
}
