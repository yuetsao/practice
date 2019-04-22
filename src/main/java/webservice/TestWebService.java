package webservice;

import org.apache.axis.AxisProperties;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.XMLType;

public class TestWebService {
    public static void main(String[] args) {
        try {
            AxisProperties.setProperty("axis.socketSecureFactory", MySocketFactory.class.getName());
            String endpoint = "https://iws-p-wa-weee-wod.myvecid.cn/wod/services/Getsso?wsdl";
            //直接引用远程的wsdl文件
            //以下都是套路
            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(endpoint);
            call.setOperationName("GET_sso");//WSDL里面描述的接口名称
            call.setReturnType(XMLType.XSD_STRING);//设置返回类型
            String result = (String)call.invoke(new Object[]{});
            //给方法传递参数，并且调用方法
            System.out.println("result is "+result);
        }
        catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
