package com.yuetsao.demos;

import org.apache.axis.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName com.yuetsao.demos.Test
 * @Description
 * @Author caoyue
 * @Date 2021/5/25 3:15 下午
 * @Version V1.0
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println(sum("1111111111", "13"));
    }

    public static String sum(String num1, String num2) {
        if(StringUtils.isEmpty(num1) || StringUtils.isEmpty(num2)) {
            return "";
        }
        int calculateThreshold = 5;
        if(num1.length() < calculateThreshold) {
            num1 = getAppendedStr(num1, calculateThreshold - num1.length());
        }
        if(num2.length() < calculateThreshold) {
            num2 = getAppendedStr(num2, calculateThreshold - num2.length());
        }
        if(num1.length() > num2.length()) {
           num2 = getAppendedStr(num2, num1.length() - num2.length());
        }else {
            num1 = getAppendedStr(num1, num2.length() - num1.length());
        }
        List<String> num1List = new ArrayList<>();
        List<String> num2List = new ArrayList<>();
        int beginIndex = 0;
        for(int i=0; i<num1.length(); i=i+calculateThreshold) {
            num1List.add(num1.substring(beginIndex, beginIndex+calculateThreshold));
            num2List.add(num2.substring(beginIndex, beginIndex+calculateThreshold));
            beginIndex += calculateThreshold;
        }
        return getCalculateResult(num1List, num2List, calculateThreshold);
    }

    public static String getCalculateResult(List<String> list1, List<String> list2, int threshold) {
        StringBuilder resultBuilder = new StringBuilder();
        Integer jinwei= 0;
        Stack<String> numStack = new Stack<>();
        for(int i=list1.size()-1; i>=0; i--) {
            Integer tempSumResult = Integer.valueOf(list1.get(i))+Integer.valueOf(list2.get(i)) + jinwei;
            if(String.valueOf(tempSumResult).length()> threshold) {
                jinwei = Integer.valueOf(String.valueOf(tempSumResult).substring(0, String.valueOf(tempSumResult).length() - threshold));
            }else {
                jinwei = 0;
            }
            numStack.push(String.valueOf(tempSumResult));
        }
        while (!numStack.isEmpty()) {
            resultBuilder.append(numStack.pop());
        }
        return resultBuilder.toString();
    }

    public static String getAppendedStr (String paramStr , Integer zeroNum) {
        StringBuilder appendZeroBuilder = new StringBuilder();
        for(int i =0 ; i< zeroNum; i++) {
            appendZeroBuilder.append("0");
        }
        appendZeroBuilder.append(paramStr);
        return appendZeroBuilder.toString();
    }
}
