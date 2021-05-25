package testJVM.loadclass;

/**
 * @ClassName WriteCombining
 * @Description cpu 有一个特别高速的缓存，总共有4个字节
 * 假设有 6个字节，如果一次性写入，就会出现 4，2
 * 如果分开写 3，3 就会速度高一些
 * @Author caoyue
 * @Date 2021/5/25 10:44 上午
 * @Version V1.0
 **/
public final class WriteCombining {

    private static final int    ITERATIONS = Integer.MAX_VALUE;
    private static final int    ITEMS      = 1 << 24;
    private static final int    MASK       = ITEMS - 1;

    private static final byte[] arrayA     = new byte[ITEMS];
    private static final byte[] arrayB     = new byte[ITEMS];
    private static final byte[] arrayC     = new byte[ITEMS];
    private static final byte[] arrayD     = new byte[ITEMS];
    private static final byte[] arrayE     = new byte[ITEMS];
    private static final byte[] arrayF     = new byte[ITEMS];

    public static void main(final String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + " SingleLoop duration (ns) = " + runCaseOne());
            System.out.println(i + " SplitLoop duration (ns) = " + runCaseTwo());
        }
        int result = arrayA[1] + arrayB[2] + arrayC[3] + arrayD[4] + arrayE[5] + arrayF[6];
        System.out.println("result = " + result);
    }

    public static long runCaseOne() {
        long start = System.nanoTime();
        int i = ITERATIONS;

        while (--i != 0) {
            int slot = i & MASK;
            byte b = (byte) i;
            arrayA[slot] = b;
            arrayB[slot] = b;
            arrayC[slot] = b;
            arrayD[slot] = b;
            arrayE[slot] = b;
            arrayF[slot] = b;
        }
        return System.nanoTime() - start;
    }

    public static long runCaseTwo() {
        long start = System.nanoTime();
        int i = ITERATIONS;
        while (--i != 0) {
            int slot = i & MASK;
            byte b = (byte) i;
            arrayA[slot] = b;
            arrayB[slot] = b;
            arrayC[slot] = b;
        }
        i = ITERATIONS;
        while (--i != 0) {
            int slot = i & MASK;
            byte b = (byte) i;
            arrayD[slot] = b;
            arrayE[slot] = b;
            arrayF[slot] = b;
        }
        return System.nanoTime() - start;
    }
}
