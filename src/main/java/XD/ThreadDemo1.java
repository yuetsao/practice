package XD;

import java.util.concurrent.Callable;

public class ThreadDemo1 implements Callable<Object> {
    @Override
    public Object call() throws Exception {
        return "返回值";
    }
}
