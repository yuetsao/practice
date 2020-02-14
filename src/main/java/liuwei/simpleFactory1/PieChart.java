package liuwei.simpleFactory1;

/**
 * @Title: PieChart
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/14 18:14
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/14 18:14
 * @company: shopin.net
 * @version: V1.0
 */

public class PieChart implements Chart {
    
    public PieChart() {
        System.out.println("创建饼状图");
    }
    
    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}
