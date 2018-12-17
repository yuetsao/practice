package xmlParser;

import org.dom4j.Document;
import org.dom4j.Element;

import javax.swing.plaf.basic.BasicColorChooserUI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class AbstractApplicationContext implements ApplicationContext {

    protected ElementLoader elementLoader = new ElementLoaderImpl();

    protected DocumentHolder documentHolder = new XMLDocumentHolder();

    protected Map<String, Object> beans = new HashMap<String, Object>();

    protected BeanCreator beanCreator = new BeanCreatorImpl();

    protected ElementReader elementReader = new ElementReaderImpl();

    protected BasicColorChooserUI.PropertyHandler propertyHandler = new PropertyHandlerImpl();

    protected void setUpElements(String[] xmlPaths){

        URL classPathUrl = AbstractApplicationContext.class.getClassLoader().getResource(".");

        String classpath;

        try {
            classpath = java.net.URLDecoder.decode(classPathUrl.getPath(), "utf-8");

            for (String path : xmlPaths) {

                Document doc = documentHolder.getDocument(classpath + path);

                elementLoader.addElements(doc);

            }
        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String id) {

        Object bean = this.beans.get(id);

        if (bean == null) {

            bean = handleSingleton(id);

        }

        return bean;
    }

    private Object handleSingleton(String id) {

        Object bean = createBean(id);

        if (isSingleton(id)) {

            this.beans.put(id, bean);

        }

        return bean;
    }

    private Object createBean(String id) {

        Element e = elementLoader.getElement(id);

        if (e == null) {

            try {
                throw new BeanCreateException("element not found" + id);
            } catch (BeanCreateException e1) {

                e1.printStackTrace();
            }

        }

        Object result = instance(e);

        System.out.println("创建bean" + id);

        System.out.println("该bean的对象是" + result);

        AutoWire autoWire = elementReader.getAutoWire(e);

        if (autoWire instanceof ByNameAutoWire) {

            // 使用名称自动装配
            autowireByName(result);

        } else if (autoWire instanceof NoAutoWire) {

            setterInject(result, e);

        }

        return null;
    }


    protected void createBeans(){

        Collection<Element> elements = elementLoader.getElements();

        for (Element element : elements) {

            boolean lazy = elementReader.isLazy(element);

            if (!lazy) {

                String id = element.attributeValue("id");

                Object bean = this.getBean(id);

                if (bean==null) {

                    handleSingleton(id);

                }

            }

        }

    }

    private void setterInject(Object obj, Element e) {

        List<PropertyElement> properties = elementReader.getPropertyValue(e);

        Map<String, Object> propertiesMap = getPropertyArgs(properties);

        propertyHandler.setProperties(obj, propertiesMap);

    }

    private Map<String, Object> getPropertyArgs(List<PropertyElement> properties) {

        Map<String, Object> result = new HashMap<String, Object>();

        for (PropertyElement p : properties) {

            DataElement de = p.getDataElement();

            if (de instanceof RefElement) {

                result.put(p.getName(), this.getBean((String) de.getValue()));

            } else if (de instanceof ValueElement) {

                result.put(p.getName(), de.getValue());

            }

        }

        return result;
    }

    private void autowireByName(Object obj) {

        Map<String, Method> methods = propertyHandler.getSetterMethodsMap(obj);

        for (String s : methods.keySet()) {

            Element e = elementLoader.getElement(s);

            if (e == null)
                continue;

            Object bean = this.getBean(s);

            Method method = methods.get(s);

            propertyHandler.executeMethod(obj, bean, method);

        }

    }

    private Object instance(Element e) {

        String className = elementReader.getAttribute(e, "class");

        List<Element> constructorElements = elementReader.getConstructorElements(e);

        if (constructorElements.size() == 0) {

            return beanCreator.createBeanUseDefaultConstruct(className);

        } else {

            List<Object> args = getConstructArgs(e);

            return beanCreator.createBeanUseDefineConstruct(className, args);
        }

    }

    private List<Object> getConstructArgs(Element e) {

        List<DataElement> datas = elementReader.getConstructorValue(e);

        List<Object> result = new ArrayList<Object>();

        for (DataElement d : datas) {

            if (d instanceof ValueElement) {

                d = (ValueElement) d;

                result.add(d.getValue());

            } else if (d instanceof RefElement) {

                d = (RefElement) d;

                String refid = (String) d.getValue();

                result.add(this.getBean(refid));

            }
        }

        return result;
    }

    @Override
    public boolean containsBean(String id) {

        Element element = elementLoader.getElement(id);

        return element == null ? false : true;

    }

    @Override
    public boolean isSingleton(String id) {

        Element e = elementLoader.getElement(id);

        return elementReader.isSingleTon(e);
    }

}
