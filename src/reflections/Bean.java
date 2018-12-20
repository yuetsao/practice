package reflections;

public class Bean {
    private String beanName;
    private String beanAge;
    private int id;

    public Bean(String beanName, String beanAge, int id) {
        this.beanName = beanName;
        this.beanAge = beanAge;
        this.id = id;
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanAge() {
        return beanAge;
    }

    public void setBeanAge(String beanAge) {
        this.beanAge = beanAge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
