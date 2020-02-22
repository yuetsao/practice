package liuwei.flyweight;

import java.util.Hashtable;

/**
 * @Title: IgoChessmanFactory
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/22 13:41
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/22 13:41
 * @company: shopin.net
 * @version: V1.0
 */

public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht;
    
    private IgoChessmanFactory() {
        ht = new Hashtable();
        IgoChessman black, white;
        black = new BlackIgoChessman();
        ht.put("b", black);
        white = new WhiteIgoChessman();
        ht.put("w", white);
    }
    public static IgoChessmanFactory getInstance() {
        return instance;
    }
    public static IgoChessman getIgoChessman(String color) {
        return (IgoChessman)ht.get(color);
    }
}
