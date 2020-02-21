package liuwei.facade;


/**
 * @Title: CipherMachine
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/20 20:17
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/20 20:17
 * @company: shopin.net
 * @version: V1.0
 */

public class CipherMachine {
    public String encrypt(String plainText) {
        System.out.println("数据加密， 将明文转化为密文");
        String es = "";
        for(int i=0; i<plainText.length(); i++) {
            String c = String.valueOf(plainText.charAt(i) % 7);
            es += c;
        }
        System.out.println(es);
        return es;
    }
}
