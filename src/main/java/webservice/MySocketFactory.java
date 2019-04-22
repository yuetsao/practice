package webservice;

import org.apache.axis.components.net.JSSESocketFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Hashtable;

public class MySocketFactory extends JSSESocketFactory {

    public MySocketFactory(Hashtable attributes) {
        super(attributes);
    }

    TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        @Override
        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {}

        @Override
        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {}
    }};

    @Override
    public void initFactory() throws IOException {
        SSLContext context;
        try {
            context = SSLContext.getInstance("TLSv1.2");
            context.init(null, trustAllCerts, new java.security.SecureRandom());
            sslFactory = context.getSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (KeyManagementException e) {
            e.printStackTrace();
        }
    }

}
