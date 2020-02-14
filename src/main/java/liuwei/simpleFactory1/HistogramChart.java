package liuwei.simpleFactory1;

/**
 * @Title: HistogramChart
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/14 18:13
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/14 18:13
 * @company: shopin.net
 * @version: V1.0
 */

public class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建柱状图");
    }


    @Override
    public void display() {
        System.out.println("显示柱状图");
    }
}
