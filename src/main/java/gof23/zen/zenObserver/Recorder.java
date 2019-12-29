package gof23.zen.zenObserver;

public class Recorder {
    //域名
    private String domain;
    //IP地址
    private String ip;
    //属主
    private String owner;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Recorder{" +
                "domain='" + domain + '\'' +
                ", ip='" + ip + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
