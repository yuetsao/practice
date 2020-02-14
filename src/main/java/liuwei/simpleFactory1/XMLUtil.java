package liuwei.simpleFactory1;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @Title: XMLUtil
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/14 19:03
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/14 19:03
 * @company: shopin.net
 * @version: V1.0
 */

public class XMLUtil {
    //该方法用于从XML配置文件中提取图表类型，并返回类型名
    public static String getCahrtType() {
        try {
            
        //创建文档对象
        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dFactory.newDocumentBuilder();
        Document doc;
        doc = builder.parse(new File("src/main/java/liuwei/simpleFactory1/config.xml"));
        //获取包含图表类型的文本结点
        NodeList nl = doc.getElementsByTagName("chartType");
        Node classNode = nl.item(0).getFirstChild();
        String chartType = classNode.getNodeValue().trim();
        return chartType;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
