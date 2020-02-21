package liuwei.facade;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Title: FileReader
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/20 20:11
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/20 20:11
 * @company: shopin.net
 * @version: V1.0
 */

public class FileReader {
    public String read(String fileNameSrc) {
        System.out.println("读取文件， 获取明文：");
        StringBuffer sb = new StringBuffer();
        try {
            FileInputStream inFS = new FileInputStream(fileNameSrc);
            int data;
            while ((data = inFS.read()) != -1) {
                sb = sb.append((char) data);
            }
            inFS.close();
            System.out.println(sb.toString());
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            System.out.println("文件操作错误");
        }
        return sb.toString();
    }
}
