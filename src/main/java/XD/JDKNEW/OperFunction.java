package XD.JDKNEW;

@FunctionalInterface
public interface OperFunction<R, T> {

    R operator(T t1, T t2);

    default void test() {
        System.out.println("test");
    }
}
