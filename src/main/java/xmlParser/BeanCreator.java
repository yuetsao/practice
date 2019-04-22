package xmlParser;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public interface BeanCreator  {

    Object createBeanUseDefaultConstruct(String className);//使用空构造器

    Object createBeanUseDefineConstruce(String className, List<Object> args);//使用定义的构造器

    Map<String, Method> getSetterMethodsMap(Object obj);

    void executeMethod(Object object,Object argBean,Method method);

}
