package gof23.chainofresponsibility;

public class GeneralManager extends Leader {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<30) {
            System.out.println("员工" + leaveRequest.getEmpName()+"请假");
            System.out.println("总经理审批通过");
        }else {
            System.out.println("莫非这个人想辞职，居然请假" + leaveRequest.getLeaveDays() +"天");
        }
    }
}
