package gof23.zen.zenObserver;

public class ChinaTopDnsServer extends DnsServer {
    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith("cn");
    }

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("中国顶级服务器");
    }
}
