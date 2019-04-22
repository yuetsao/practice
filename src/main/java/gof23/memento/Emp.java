package gof23.memento;

//源发器类
public class Emp {
    private String name;
    private int age;
    private double salary;

    //进行备忘操作，并返回备忘对象
    public EmpMemento menento () {
        return new EmpMemento(this);
    }

    public void recovery (EmpMemento empmen) {
        this.name = empmen.getName();
        this.age = empmen.getAge();
        this.salary = empmen.getSalary();
    }

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
