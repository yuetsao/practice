package gof23.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        Leader a = new Director("zhangsan");
        Leader b = new Manager("lisi");
        Leader c = new GeneralManager("wangwu");
        //组织责任链对象的关系
        a.setNextLeader(b);
        b.setNextLeader(c);
        LeaveRequest leaveRequest = new LeaveRequest("tom", 10, "go home");
        a.handleRequest(leaveRequest);
    }
}
