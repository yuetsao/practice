package com.yuetsao.demos;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName Singlton
 * @Description
 * @Author caoyue
 * @Date 2021/6/7 8:20 下午
 * @Version V1.0
 **/
public class Singlton {
    private static Singlton singlton;
    Queue<Integer> queue = new LinkedList<>();
}
