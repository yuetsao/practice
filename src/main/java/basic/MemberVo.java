package basic;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-09-04 12:18
 **/
public class MemberVo {
    private static final long serialVersionUID = -3336089335806434937L;

    private String sid;//会员ID
    private String memName;//用户名
    private String xsWxNo;//下沙公众号
    private String bjWxNo;//北京公众号
    private String jqWxNo;//笕桥公众号
    private String mobile;//手机号
    private String memEmail;//邮箱
    private String memPwd;//会员密码
    private String oldPwd;//修改前密码
    private String membersSid;//会员ID
    private String memStatus;//会员状态
    private String loginKey;
    private String regDate;//注册时间
    private String loginDate;//登录日期
    private String memBit;//是否有效
    private String loginTimes;//登录时间
    private String mType;//会员级别v1、v2、v3
    private String headShow;
    public String getSid() {
        return sid;
    }
    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getMemName() {
        return memName;
    }
    public void setMemName(String memName) {
        this.memName = memName;
    }
    public String getXsWxNo() {
        return xsWxNo;
    }
    public void setXsWxNo(String xsWxNo) {
        this.xsWxNo = xsWxNo;
    }
    public String getBjWxNo() {
        return bjWxNo;
    }
    public void setBjWxNo(String bjWxNo) {
        this.bjWxNo = bjWxNo;
    }
    public String getJqWxNo() {
        return jqWxNo;
    }
    public void setJqWxNo(String jqWxNo) {
        this.jqWxNo = jqWxNo;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getMemEmail() {
        return memEmail;
    }
    public void setMemEmail(String memEmail) {
        this.memEmail = memEmail;
    }
    public String getMemPwd() {
        return memPwd;
    }
    public void setMemPwd(String memPwd) {
        this.memPwd = memPwd;
    }
    public String getOldPwd() {
        return oldPwd;
    }
    public void setOldPwd(String oldPwd) {
        this.oldPwd = oldPwd;
    }
    public String getMembersSid() {
        return membersSid;
    }
    public void setMembersSid(String membersSid) {
        this.membersSid = membersSid;
    }
    public String getMemStatus() {
        return memStatus;
    }
    public void setMemStatus(String memStatus) {
        this.memStatus = memStatus;
    }
    public String getLoginKey() {
        return loginKey;
    }
    public void setLoginKey(String loginKey) {
        this.loginKey = loginKey;
    }
    public String getRegDate() {
        return regDate;
    }
    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
    public String getLoginDate() {
        return loginDate;
    }
    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }
    public String getMemBit() {
        return memBit;
    }
    public void setMemBit(String memBit) {
        this.memBit = memBit;
    }
    public String getLoginTimes() {
        return loginTimes;
    }
    public void setLoginTimes(String loginTimes) {
        this.loginTimes = loginTimes;
    }
    public String getmType() {
        return mType;
    }
    public void setmType(String mType) {
        this.mType = mType;
    }
    public String getHeadShow() {
        return headShow;
    }
    public void setHeadShow(String headShow) {
        this.headShow = headShow;
    }
    @Override
    public String toString() {
        return "MemberVo [sid=" + sid + ", memName=" + memName + ", xsWxNo=" + xsWxNo + ", bjWxNo=" + bjWxNo
                + ", jqWxNo=" + jqWxNo + ", mobile=" + mobile + ", memEmail=" + memEmail + ", memPwd=" + memPwd
                + ", oldPwd=" + oldPwd + ", membersSid=" + membersSid + ", memStatus=" + memStatus + ", loginKey="
                + loginKey + ", regDate=" + regDate + ", loginDate=" + loginDate + ", memBit=" + memBit
                + ", loginTimes=" + loginTimes + ", mType=" + mType + ", headShow=" + headShow + "]";
    }
}
