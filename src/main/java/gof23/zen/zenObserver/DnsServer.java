package gof23.zen.zenObserver;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

//抽象类中不必要实现所有的接口方法
public abstract class DnsServer extends Observable implements Observer {
    //处理请求，也就是接收到时间的处理
    public void update (Observable arg0, Object arg1) {
        Recorder recorder = (Recorder) arg1;
        if(isLocal(recorder)) {
            recorder.setIp(genIpAddress());
        }else {
            responseFromUpperServer(recorder);
        }
        sign(recorder);
    }
    public void setUpperServer(DnsServer dnsServer) {
        super.deleteObservers();
        super.addObserver(dnsServer);
    }
    protected abstract boolean isLocal(Recorder recorder);

    private void responseFromUpperServer(Recorder recorder) {
        super.setChanged();
        super.notifyObservers(recorder);
    }

    protected abstract void sign(Recorder recorder);

    //随机产生一个IP地址，工具类
    private String genIpAddress() {
        Random random = new Random();
        String address = random.nextInt(255) + "." + random.nextInt(255) + "." +
                random.nextInt(255) + "." + random.nextInt(255);
        return address;
    }

}
