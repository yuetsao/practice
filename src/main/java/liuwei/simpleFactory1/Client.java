package liuwei.simpleFactory1;

/**
 * @Title: Client
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/14 18:24
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/14 18:24
 * @company: shopin.net
 * @version: V1.0
 */

public class Client {
    public static void main(String[] args) {
        Chart chart;
        String chartType = XMLUtil.getCahrtType();
        chart = ChartFactory.getChart(chartType);
        chart.display();
    }
}
