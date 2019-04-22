package gof23.prototype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Cloneable, Serializable {  //1997年克隆羊
    private String sname;
    private Date birthday;

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Object obj = super.clone();
        Sheep s2 = (Sheep) obj;
        s2.birthday = (Date)this.birthday.clone();
        return obj;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
