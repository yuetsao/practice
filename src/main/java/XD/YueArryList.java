package XD;

import java.io.Serializable;

public class YueArryList implements Serializable {

    //当前集合类是否被并发修改，即迭代器并发修改的fail
    private transient int modCount = 0;

    private static final Long serialVersionUID = 1L;

    private static final int DEFAULT_CAPACITY = 10;

    private static final Object[] EMPTY_ELEMENT_DATA = {};

    private int size;

    transient Object [] elementData;

    public YueArryList () {
        this.elementData = EMPTY_ELEMENT_DATA;
    }

    public YueArryList(int initalCapacity) {
        if(initalCapacity>0) {
            this.elementData = new Object[initalCapacity];
        } else if(initalCapacity == 0) {
            this.elementData = EMPTY_ELEMENT_DATA;
        } else {
            throw new IllegalArgumentException("参数异常");
        }
    }

    public boolean add(Object e) {
        //判断容量
        ensureCapacityInternal(size + 1);
        //使用下标赋值，尾部插入
        elementData[size++] = e;

        return true;
    }

    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    public int indexOf(Object o) {
        if(o == null) {
            for(int i=0; i<size; i++) {
                if(elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i=0; i<size; i++) {
                if(o.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public Object set(int index, Object o) {
        rangeCheck(index);
        Object oldValue = elementData[index];
        elementData[index] = o;
        return oldValue;
    }

    public Object remove(int index) {
        rangeCheck(index);
        modCount ++;
        Object oldValue = elementData[index];
        int numMoved = size - index -1;
        if(numMoved > 0) {
            System.arraycopy(elementData, index +1, elementData, index, numMoved);
        }
        elementData [--size] = null;
        return oldValue;
    }

    public int size() {
        return this.size;
    }

    private void rangeCheck(int index) {
        if(index > size || size <0) {
            throw new IndexOutOfBoundsException("数组越界");
        }
    }

    private void ensureCapacityInternal(int minCapacity) {
        modCount ++;
        //初次扩容，则使用默认的容量
        if(elementData == EMPTY_ELEMENT_DATA) {
            minCapacity = Math.max(DEFAULT_CAPACITY, minCapacity);
        }
        //判断是否需要扩容，需要最少容量大于现在的长度
        if(minCapacity - elementData.length > 0) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + oldCapacity>>1;
            //如果新的容量 小于 最小容量 则将最新的容量赋值给最新的容量
            if(newCapacity - minCapacity < 0) {
                newCapacity = minCapacity;
            }
            Object[] objects = new Object[newCapacity];
            System.arraycopy(elementData, 0, objects, 0, elementData.length);
            elementData = objects;
        }
    }

}
