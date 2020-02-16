package liuwei.prototype1;

import java.io.Serializable;

/**
 * @Title: Attachment
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/16 14:03
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/16 14:03
 * @company: shopin.net
 * @version: V1.0
 */

public class Attachment implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void download() {
        System.out.println("下载附件，文件名为：" + name );
    }
}
