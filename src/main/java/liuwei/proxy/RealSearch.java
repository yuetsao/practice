package liuwei.proxy;

/**
 * @Title: RealSearch
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/22 21:39
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/22 21:39
 * @company: shopin.net
 * @version: V1.0
 */

public class RealSearch implements Searcher {
    @Override
    public String doSearch(String userId, String keyword) {
        System.out.println("用户" + userId + "使用关键词" + keyword + "查询商务信息");
        return  "返回具体信息";
    }
}
