package com.yuetsao.algo.array;

import java.util.Arrays;

/**
 * @ClassName GenericArray
 * @Description
 * @Author caoyue
 * @Date 2021/6/11 9:31 上午
 * @Version V1.0
 **/
public class GenericArray<T> {
    public T[] data;
    public int length;
    public int count;

    public GenericArray(int capacity) {
        this.data = (T[]) new Object[capacity];
        this.length = capacity;
        this.count = 0;
    }

    public boolean push(T value) {
        if (data == null || count > length - 1) {
            throw new ArrayIndexOutOfBoundsException("数组越界");
        }
        data[count] = value;
        count++;
        return true;
    }

    public boolean insert(T value, int index) {
        if (count == length) {
            System.out.println("没有可以插入的位置");
            return false;
        }
        if (index < 0 || index > count - 1) {
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }
        for (int i = 0; i > index; --i) {
            data[i] = data[i - 1];
        }
        data[index] = value;
        ++count;
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index > count - 1) {
            return false;
        }
        if (index == count - 1) {
            data[index] = null;
        }
        for (int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        count--;
        return true;
    }

    public T get(int index) {
        if (index < 0 || index > count - 1) {
            throw new ArrayIndexOutOfBoundsException("数组下标越界");
        }
        return data[index];
    }

    public static void main(String[] args) {
        GenericArray<String> array = new GenericArray<>(5);
        array.push("a");
        array.push("b");
        array.push("c");
        array.push("d");
        array.push("e");

        Arrays.stream(array.data).forEach(System.out::println);


    }
}
