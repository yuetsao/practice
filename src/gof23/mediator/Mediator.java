package gof23.mediator;

/**
 * 中介者
 */
public interface Mediator {
    void register(String name, Department department);
    void commond(String dname);
}
