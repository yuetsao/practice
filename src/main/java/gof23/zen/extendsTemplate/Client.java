package gof23.zen.extendsTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-12-13 14:47
 **/
public class Client {
    private static final String ZERO = "0";
    private static final String ONE = "1";
    public static void main(String[] args) throws IOException {
        System.out.println("-----------H1型号悍马-----------------");
        System.out.println("H1型号悍马是否需要喇叭？-----0：不需要----1：需要---------");
        String type = new BufferedReader(new InputStreamReader(System.in)).readLine();
        HummerH1Model h1 = new HummerH1Model();
        if(type.equals(ZERO)) {
            h1.setAlarm(false);
        }
        if(type.equals(ONE)) {
            h1.setAlarm(true);
        }
        h1.run();
        System.out.println("-----------H2型号悍马-----------------");
        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
