package gof23.chainofresponsibility;

public class Manager extends Leader {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<10) {
            System.out.println("员工" + leaveRequest.getEmpName()+"请假");
            System.out.println("经理审批通过");
        }else {
            if(this.nextLeader!=null) {
                this.nextLeader.handleRequest(leaveRequest);
            }

        }
    }
}
