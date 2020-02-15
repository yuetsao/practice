package liuwei.builder1;

/**
 * @Title: Actor
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 23:14
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 23:14
 * @company: shopin.net
 * @version: V1.0
 */

public class Actor {
    private String type;
    private String sex;
    private String face;
    private String costume;
    private String hiarstyle;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getHiarstyle() {
        return hiarstyle;
    }

    public void setHiarstyle(String hiarstyle) {
        this.hiarstyle = hiarstyle;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                ", face='" + face + '\'' +
                ", costume='" + costume + '\'' +
                ", hiarstyle='" + hiarstyle + '\'' +
                '}';
    }
}
