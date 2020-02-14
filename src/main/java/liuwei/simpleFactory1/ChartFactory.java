package liuwei.simpleFactory1;

/**
 * @Title: ChartFactory
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/14 18:20
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/14 18:20
 * @company: shopin.net
 * @version: V1.0
 */

public class ChartFactory {
    //静态工厂方法
    public static Chart getChart(String type) {
        Chart chart = null;
        if(type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图");
        }else if(type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图");
        }else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化设置折线图");
        }
        return chart;
    }
}
