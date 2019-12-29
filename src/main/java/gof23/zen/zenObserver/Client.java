package gof23.zen.zenObserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        //上海域名服务器
        DnsServer sh = new SHDnsServer();
        //中国顶级服务器
        DnsServer china = new ChinaTopDnsServer();
        //全球顶级域名服务器
        DnsServer top = new TopDnsServer();
        //定义查询路径
        china.setUpperServer(top);
        sh.setUpperServer(china);
        //解析域名
        System.out.println("================域名解析模拟器======================");
        while(true) {
            System.out.println("\n 请输入域名（输入N退出）：");
            try {
                String domain = new BufferedReader(new InputStreamReader(System.in)).readLine();
                if(domain.equalsIgnoreCase("n")) {
                    return;
                }
                Recorder recorder = new Recorder();
                recorder.setDomain(domain);
                sh.update(null, recorder);
                System.out.println("------------------------DNS服务器解析结果---------------------");
                System.out.println(recorder);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
