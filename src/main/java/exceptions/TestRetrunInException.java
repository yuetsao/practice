package exceptions;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-08-04 14:05
 **/
public class TestRetrunInException {
    public static int f(int value) {
        try{
            return value * value;
        } finally {
            if(value == 2) {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(f(2));
    }
}
