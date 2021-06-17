package com.yuetsao.algo.array;

import java.util.Arrays;

/**
 * @ClassName Array
 * @Description 1) 数组的插入，删除，按照下标随机访问操作；
 * 2）数组中的数据是int 类型的
 * @Author caoyue
 * @Date 2021/6/10 10:35 下午
 * @Version V1.0
 **/
public class Array {
    
    //定义存储元素的数组
    public  int [] data;
    
    //数组的长度
    public  int length;
    
    //数组实际存储元素的个数
    public  int count;

    public Array (int capacity) {
        this.data = new int[capacity];
        this.length = capacity;
        this.count = 0;
    }
    
    /**
     * @Author caoyue
     * @Descriptionnm 数组增加元素
     * @Date 10:44 下午 2021/6/10
     * @Param [i]
     * @return boolean
     **/
    public boolean push(int i) {
        if(data == null || count > length-1) {
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
        data[count] = i;
        count ++;
        return true;
    }

    public boolean insert(int value ,int index) {
        if(count == length) {
            System.out.println("没有可以插入的位置");
            return false;
        }
        if(index <0 || index>count-1) {
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }
        for (int i = 0; i>index; --i) {
            data[i] = data[i-1];
        }
        data[index] = value;
        ++count;
        return true;
    }

    public int get(int index) {
        if(index <0 || index>count -1) {
           throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }
        return data[index];
    }

    public boolean remove(int index) {
        if(index<0 || index > count-1) {
            return false;
        }
        if(index == count -1) {
            data[index]  = 0;
        }
        for (int i = index; i < data.length-1; i++) {
            data[i] = data[i+1];
        }
        count --;
        return true;
    }

    public static void main(String[] args) {
        Array array = new Array(5);
//        array.push(1);
//        array.push(2);
//        array.push(3);
//        array.push(4);
//        array.push(5);
//        Arrays.stream(array.data).forEach(System.out::println);
//        System.out.println(array.count);
//        System.out.println(array.length);
//        System.out.println("----------------");
//        System.out.println(array.get(1));
        array.remove(2);

        Arrays.stream(array.data).forEach(System.out::println);

    }
    
    
    
}
