package xmlParser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanCreatorImpl implements BeanCreator{

    @Override
    public Object createBeanUseDefaultConstruct(String className) {

        Object object=null;
        try {
            Class clazz = Class.forName(className);

            object= clazz.newInstance();

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (InstantiationException e) {

            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return object;

    }
    /**
     * className:类的名字
     * args:配置的构造参数
     */

    @Override
    public Object createBeanUseDefineConstruct(String className, List<Object> args) {

        Class[] argsClass=getArgsClasses(args);

        try {

            Class clazz = Class.forName(className);

            Constructor constructor=findConstructor(clazz,argsClass);



        } catch (Exception e) {
            // TODO: handle exception
        }

        return null;
    }

    /**
     * 根据类型和参数查找构造器
     * @param clazz
     * @param argsClass
     * @return
     */
    private Constructor findConstructor(Class clazz, Class[] argsClass) throws NoSuchMethodException{

        Constructor constructor=  getConstructor(clazz,argsClass);

        if (constructor==null) {

            Constructor[] constructors = clazz.getConstructors();

            for (Constructor c : constructors) {

                Class[] constructorArgsClass = c.getParameterTypes();

                if (constructorArgsClass.length==argsClass.length) {

                    if (isSameArgs(argsClass,constructorArgsClass)) {

                        return c;

                    }

                }
            }

        }

        return null;
    }

    private boolean isSameArgs(Class[] argsClass, Class[] constructorArgsClass) {

        for (int i = 0; i < argsClass.length; i++) {

            try{

                argsClass[i].asSubclass(constructorArgsClass[i]);

                if (i==(argsClass.length-1)) {

                    return true;

                }}catch (Exception e) {
                e.printStackTrace();

                break;

            }
        }

        return false;
    }
    private Constructor getConstructor(Class clazz, Class[] argsClass) throws SecurityException, NoSuchMethodException {

        try {

            Constructor constructor = clazz.getConstructor(argsClass);

            return constructor;

        } catch (Exception e) {

            return null;
        }
    }


    private Class[] getArgsClasses(List<Object> args) {

        //装有class类的list集合
        List<Class> reslut =new ArrayList<Class>();

        for (Object arg : args) {

            reslut.add(getClass(arg));
        }

        Class[] a = new Class[reslut.size()];

        return reslut.toArray(a);
    }

    private Class getClass(Object obj) {

        if (obj instanceof Integer) {

            return Integer.TYPE;

        }else if (obj instanceof Double) {

            return Double.TYPE;
        }else if (obj instanceof Long) {

            return Long.TYPE;

        }else if (obj instanceof Float) {

            return Float.TYPE;

        }else if (obj instanceof Character) {

            return Character.TYPE;

        }else if (obj instanceof Byte) {

            return Byte.TYPE;
        }

        return obj.getClass();
    }

    @Override
    public void executeMethod(Object object, Object argBean, Method method) {

        try {
            Class[] paramterTypes = method.getParameterTypes();

            if (paramterTypes.length==1) {

                if (isMethodArgs(method,paramterTypes[0])) {

                    method.invoke(object, argBean);

                }

            }

        } catch (Exception e) {

            try {
                throw new BeanCreateException("autoWire exception"+e.getMessage());

            } catch (BeanCreateException e1) {

                e1.printStackTrace();
            }
        }

    }

    private boolean isMethodArgs(Method method, Class class1) {

        Class[] c = method.getParameterTypes();

        if (c.length==1) {

            try {

                class1.asSubclass(c[0]);

                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }

        }

        return false;
    }
    @Override
    public Map<String, Method> getSetterMethodsMap(Object obj) {

        List<Method>    methods=getSetterMethodsList(obj);

        Map<String, Method> result=new HashMap<String ,Method>();

        for (Method method : methods) {

            String propertyName=getMethodNameWithOutSet(method.getName());

        }





        return null;
    }

    /**
     * 还原setter方法
     * @param methodname
     * @return
     */

    private String getMethodNameWithOutSet(String methodname) {

        String propertyName=methodname.replace("set", "");

        String firstWord=propertyName.substring(0,1);

        String lowerFirstWord = firstWord.toLowerCase();

        return propertyName.replaceFirst(firstWord, lowerFirstWord);

    }


    private List<Method> getSetterMethodsList(Object obj) {

        Class clazz = obj.getClass();

        List<Method> result=new ArrayList<Method>();

        Method[] methods = clazz.getMethods();

        for (Method method : methods) {

            if (method.getName().startsWith("Set")) {

                result.add(method);

            }
        }

        return result;
    }
}
