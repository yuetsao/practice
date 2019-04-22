package gof23.memento;

public class Client {
    public static void main(String[] args) {
        CareTake careTake = new CareTake();
        Emp emp = new Emp("caoyue", 18, 9000000.0);
        System.out.println("第一次创建对象， 姓名："+ emp.getName()+ "年龄："+ emp.getAge() + "工资："+ emp.getSalary());
        careTake.setEmpMemento(emp.menento());
        emp.setName("xutianci");
        emp.setAge(28);
        emp.setSalary(900);
        System.out.println("第二次创建对象， 姓名："+ emp.getName()+ "年龄："+ emp.getAge() + "工资："+ emp.getSalary());
        emp.recovery(careTake.getEmpMemento());
        System.out.println("第三次创建对象， 姓名："+ emp.getName()+ "年龄："+ emp.getAge() + "工资："+ emp.getSalary());

    }
}
