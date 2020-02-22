package liuwei.proxy;

/**
 * @Title: ProxySearcher
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/22 21:42
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/22 21:42
 * @company: shopin.net
 * @version: V1.0
 */

public class ProxySearcher implements Searcher{
    
    private RealSearch realSearch = new RealSearch();
    private AccessValidator validator;
    private Logger logger;
    
    @Override
    public String doSearch(String userId, String keyword) {
        if(validator.validate(userId)) {
            String result = realSearch.doSearch(userId, keyword);
            logger.log(userId);
            return result;
        } else {
            return null;
        }
    }

    public boolean validate (String userId) {
        validator = new AccessValidator();
        return validator.validate(userId);
    }
    public void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }
}
