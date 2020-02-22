package liuwei.proxy;

/**
 * @Title: AccessValidator
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/22 21:35
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/22 21:35
 * @company: shopin.net
 * @version: V1.0
 */

public class AccessValidator {
    public boolean validate(String userId) {
        System.out.println("在数据库中验证用户" + userId + "是否为合法用户？");
        if(userId.equalsIgnoreCase("杨过")) {
            System.out.println(userId + "登录成功");
            return true;
        }else {
            System.out.println(userId + "登录失败");
            return false;
        }
    }
}
