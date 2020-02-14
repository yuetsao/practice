package liuwei.simpleFactory1;

/**
 * @Title: LineChart
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/14 18:16
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/14 18:16
 * @company: shopin.net
 * @version: V1.0
 */

public class LineChart implements Chart {
    
    public LineChart() {
        System.out.println("创建折线图");
    }
    
    @Override
    public void display() {
        System.out.println("显示折线图");
    }
}
