package liuwei.flyweight;

/**
 * @Title: Client
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/22 13:47
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/22 13:47
 * @company: shopin.net
 * @version: V1.0
 */

public class Client {
    public static void main(String[] args) {
        IgoChessman black1, black2, black3,  white1, white2;
        IgoChessmanFactory factory;
        
        //获取享元工厂对象
//        factory = IgoChessmanFactory.getInstance();
        
        black1 = IgoChessmanFactory.getIgoChessman("b");
        black2 = IgoChessmanFactory.getIgoChessman("b");
        black3 = IgoChessmanFactory.getIgoChessman("b");

        System.out.println("判断两颗黑子是否相同" +(black1 == black2));

        white1 = IgoChessmanFactory.getIgoChessman("w");
        white2 = IgoChessmanFactory.getIgoChessman("w");

        System.out.println("判断两颗白子是否相同" +(white1 == white2));
        
        black1.display();
        black2.display();
        black3.display();
        white1.display();
        white2.display();

    }
}
