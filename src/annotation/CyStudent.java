package annotation;

@Table("tb_student")
public class CyStudent {
    //进行orm映射时可以依据这个附加信息进行转化
    @CyField(columnName = "id", type = "int", lenght = 11)
    private int id;
    @CyField(columnName = "sname", type = "varchar", lenght = 64)
    private String studentName;
    @CyField(columnName = "age", type = "int", lenght = 3)
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
