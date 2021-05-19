package XD.JDKNEW;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Generic <T>{

    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public <E> E getProduct(ArrayList<E> list) {
        return list.get(0);
    }
    private T[] array;
    public Generic(Class<T> clz, int len) {
        array = (T[]) Array.newInstance(clz, len);
    }

    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                '}';
    }
}
