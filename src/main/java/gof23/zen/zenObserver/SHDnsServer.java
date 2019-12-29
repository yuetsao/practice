package gof23.zen.zenObserver;

public class SHDnsServer extends DnsServer {

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".sh.cn");
    }

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("上海DNS服务器");
    }
}
