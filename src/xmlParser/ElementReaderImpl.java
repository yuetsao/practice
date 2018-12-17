package xmlParser;

import org.dom4j.Element;

import java.util.ArrayList;
import java.util.List;


public class ElementReaderImpl implements ElementReader{

    /**
     * 判断是否延迟加载
     */
    @Override
    public boolean isLazy(Element element) {

        String lazy = getAttribute(element, "lazy-int");//得到是否懒加载这个元素

        Element parent = element.getParent();

        Boolean parentLazy = new Boolean(getAttribute(parent, "default-lazy-int"));

        if (parentLazy) {

            if ("false".equals(lazy)) return false;

            return true;


        }else {

            if ("true".equals(lazy))  return true;

            return false;
        }
    }

    /**
     * 获取constructor-arg节点
     */
    @Override
    public List<Element> getConstructorElements(Element element) {

        List<Element> childrens = element.elements();//得到bean节点下的所有节点

        List<Element> reslut=new ArrayList<Element>();//存放节点的链表

        for (Element e : childrens) {//遍历

            if ("constructor-arg".equals(e.getName())) {//如果是constructor-arg节点

                reslut.add(e);//放入到预设的链表中
            }

        }
        return reslut; //返回这个链表
    }

    /**
     * 根据元素的name获取元素的值
     */
    public String getAttribute(Element element, String name) {

        String value = element.attributeValue(name);

        return value;
    }

    /**
     * 判断是不是单例模式
     */
    public boolean isSingleTon(Element element) {

        Boolean singleTon = new Boolean(getAttribute(element, "singleTon"));

        return singleTon;
    }


    /**
     * 获得自动注入
     */
    @Override
    public AutoWire getAutoWire(Element element) {

        String value = this.getAttribute(element, "autoWire");

        String parentValue=this.getAttribute(element.getParent(),"default-autowire");

        if ("no".equals(parentValue)) {

            if ("byName".equals(parentValue)) {

                return new ByNameAutoWire(value);

            }else {
                return new NoAutoWire(value);
            }
        }else if ("byName".equals(parentValue)) {

            if("no".equals(value)) return new NoAutoWire(value);

            return new ByNameAutoWire(value);

        }

        return new NoAutoWire(value);
    }

    @Override
    public List<DataElement> getConstructorValue(Element element) {

        List<Element> cons=getConstructorElements(element);

        List<DataElement> result = new ArrayList<DataElement>();

        for (Element e : cons) {

            List<Element> els = e.elements();

            DataElement dataElement = getDataElement(els.get(0));

            result.add(dataElement);

        }

        return result;
    }

    @Override
    public List<PropertyElement> getPropertyValue(Element element) {

        List<Element> properties=getPropertyElements(element);

        List<PropertyElement> reslut=new ArrayList<PropertyElement>();

        for (Element e : properties) {

            List<Element> els=e.elements();

            DataElement dataElement = getDataElement(els.get(0));

            String value = getAttribute(e, "name");

            PropertyElement pe = new PropertyElement(value, dataElement);

            reslut.add(pe);

        }


        return reslut;
    }


    private DataElement getDataElement(Element element){

        String name=element.getName();

        if ("value".equals(name)) {

            String classTypeName=element.attributeValue("type");

            String data = element.getText();

            return new ValueElement(getValue(classTypeName,data));

        }else if ("ref".equals(name)) {

            return new RefElement(this.getAttribute(element, "bean"));

        }

        return null;
    }

    private Object getValue(String className,String data){

        if (isType(className,"Integer")) {

            return Integer.parseInt(data);

        }else {

            return data;
        }

    }

    private boolean isType(String className, String type) {

        if (className.indexOf(type)!=-1) {

            return true;

        }else {

            return false;

        }

    }

    @Override
    public List<Element> getPropertyElements(Element element) {

        List<Element> elements = element.elements();

        return elements;
    }


}
