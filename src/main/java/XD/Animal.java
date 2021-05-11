package XD;

public interface Animal {
    /**
     * 接口中可以有静态方法，但是必须有方法实现体，该方法只属于该接口，接口名直接调用该方法。
     */
    static void breath() {
        System.out.println("breath");
    }
}
