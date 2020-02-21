package liuwei.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Title: FileWriter
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/20 20:20
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/20 20:20
 * @company: shopin.net
 * @version: V1.0
 */

public class FileWriter {
    public void write(String encryptStr, String fileNameDes) {
        System.out.println("保存密文， 写入文件");
        try {
            FileOutputStream outFS = new FileOutputStream(fileNameDes);
            outFS.write(encryptStr.getBytes());
            outFS.close();
        }catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }catch (IOException e) {
            System.out.println("文件操作错误");
        }
    }
}
