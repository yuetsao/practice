package gof23.chainofresponsibility;

public abstract class Leader {
    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        super();
        this.name = name;
    }
    //设置责任链的后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    //处理请求的核心的抽象方法
    public  abstract  void  handleRequest(LeaveRequest leaveRequest);

}
