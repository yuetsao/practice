package liuwei.facade;

/**
 * @Title: EncryptFacade
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/20 20:24
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/20 20:24
 * @company: shopin.net
 * @version: V1.0
 */

public class EncryptFacade {
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;
    
    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }
    
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipher.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
