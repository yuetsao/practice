package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServerSocket {
    public static void main(String [] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        BufferedReader br = null;
        //创建服务器套接字，并绑定端口号：8080
        try {
            serverSocket = new ServerSocket(8080);
            //开始监听网络，此时程序处于等待状态，接受客户端消息
            clientSocket =  serverSocket.accept();
            //接受客户端套接字消息
            br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String temp = null;
            //打印消息
            while((temp = br.readLine()) !=null) {
                System.out.println(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(clientSocket != null) {
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
