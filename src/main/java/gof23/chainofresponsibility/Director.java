package gof23.chainofresponsibility;

public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<3) {
            System.out.println("员工" + leaveRequest.getEmpName()+"请假");
            System.out.println("主任审批通过");
        }else {
            if(this.nextLeader!=null) {
                this.nextLeader.handleRequest(leaveRequest);
            }
        }
    }
}
