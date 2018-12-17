package xmlParser;

public interface ApplicationContext {
    Object getBean(String id);

    boolean containsBean(String id);

    boolean isSingleton(String id);
}
