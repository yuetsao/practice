//import java.util.ArrayList;
//import java.util.List;
//package com.project.webservice;
//
//import java.io.BufferedReader;
//import java.io.ByteArrayOutputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//
//import javax.net.ssl.HostnameVerifier;
//import javax.net.ssl.HttpsURLConnection;
//import javax.net.ssl.SSLSession;
//import javax.xml.namespace.QName;
//import javax.xml.soap.MessageFactory;
//import javax.xml.soap.SOAPBody;
//import javax.xml.soap.SOAPBodyElement;
//import javax.xml.soap.SOAPConstants;
//import javax.xml.soap.SOAPEnvelope;
//import javax.xml.soap.SOAPException;
//import javax.xml.soap.SOAPMessage;
//import javax.xml.ws.Dispatch;
//import javax.xml.ws.Service;
//
//import net.sf.json.JSONObject;
///**
// * webservice绕过证书验证调用https
// * @author
// *
// */
//public abstract class webServiceClientInfo {
//    protected webServiceClientInfo (final String casServerUrl) {
//    }
//
//    static HostnameVerifier hv = new HostnameVerifier() {
//        public boolean verify(String urlHostName, SSLSession session) {
//            System.out.println("Warning: URL Host: " + urlHostName + " vs. "+ session.getPeerHost());
//            return true;
//        }
//    };
//
//    /**
//     * 连接https接口
//     * @param requestContext
//     * @param qName
//     * @param obj
//     * @return
//     * @throws Exception
//     */
//    public static String connect(String requestContext,String qName,JSONObject obj) throws Exception {
//        trustAllHttpsCertificates();
//        HttpsURLConnection.setDefaultHostnameVerifier(hv);//执行方法的最前面一定要加上这两个方法的调用
//        String ns = "DataInterface.ceair.org";
//        String wsdlUrl = "https://******.asmx?wsdl";//需要连接的https接口
//        URL url = new URL(wsdlUrl);
//        QName sname = new QName(ns, "Service");
//        Service service = Service.create(url, sname);
//        Dispatch<SOAPMessage> dispatch = service.createDispatch(new QName(ns, "ServiceSoap"), SOAPMessage.class, Service.Mode.MESSAGE);
//        dispatch.getRequestContext().put(Dispatch.SOAPACTION_USE_PROPERTY, new Boolean(true));
//        dispatch.getRequestContext().put(Dispatch.SOAPACTION_URI_PROPERTY, requestContext);
//        SOAPMessage msg = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL).createMessage();
//        msg.setProperty(SOAPMessage.CHARACTER_SET_ENCODING, "gb2312");
//        SOAPEnvelope envelope = msg.getSOAPPart().getEnvelope();
//        SOAPBody body = envelope.getBody();
//        QName ename = new QName(ns, qName);
//        SOAPBodyElement ele = body.addBodyElement(ename);
//        ele.addChildElement(new QName(ns, "UserName")).setValue(obj.getString("UserName"));
//        ele.addChildElement(new QName(ns, "Password")).setValue(obj.getString("Password"));
//        SOAPMessage response = dispatch.invoke(msg);
//        response.setProperty(SOAPMessage.CHARACTER_SET_ENCODING, "gb2312");
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        response.writeTo(baos);
//        return baos.toString();
//    }
//
//    private static void trustAllHttpsCertificates() throws Exception {
//        javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];
//        javax.net.ssl.TrustManager tm = new miTM();
//        trustAllCerts[0] = tm;
//        javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext
//                .getInstance("SSL");
//        sc.init(null, trustAllCerts, null);
//        javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(sc
//                .getSocketFactory());
//    }
//
//    static class miTM implements javax.net.ssl.TrustManager,
//            javax.net.ssl.X509TrustManager {
//        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
//            return null;
//        }
//
//        public boolean isServerTrusted(
//                java.security.cert.X509Certificate[] certs) {
//            return true;
//        }
//
//        public boolean isClientTrusted(
//                java.security.cert.X509Certificate[] certs) {
//            return true;
//        }
//
//        public void checkServerTrusted(
//                java.security.cert.X509Certificate[] certs, String authType)
//                throws java.security.cert.CertificateException {
//            return;
//        }
//
//        public void checkClientTrusted(
//                java.security.cert.X509Certificate[] certs, String authType)
//                throws java.security.cert.CertificateException {
//            return;
//        }
//    }
//
//    public static void main(String[] args) throws SOAPException, IOException {
//        String requestContext = "http://DataInterface.ceair.org/Login";//SOAPAction
//        String qName = "Login";//peration（方法名称）
//        JSONObject obj = new JSONObject();//方法参数
//        obj.put("UserName", "test");
//        obj.put("Password", "1234");
//        String xmlDoc;
//        try {
//            xmlDoc = connect(requestContext,qName,obj);
//            System.out.println(xmlDoc);//返回数据
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
