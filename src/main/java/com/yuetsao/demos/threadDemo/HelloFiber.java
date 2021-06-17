//package com.yuetsao.demos.threadDemo;
//
//
//import co.paralleluniverse.fibers.Fiber;
//import co.paralleluniverse.fibers.SuspendExecution;
//import co.paralleluniverse.strands.SuspendableCallable;
//
///**
// * @ClassName HelloFiber
// * @Description 纤程测试
// * @Author caoyue
// * @Date 2021/5/28 12:30 上午
// * @Version V1.0
// **/
//public class HelloFiber {
//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        for(int k=0; k<10000; k++) {
//            Fiber<Void> fiber = new Fiber<>(new SuspendableCallable<Void>() {
//                @Override
//                public Void run() throws SuspendExecution, InterruptedException {
//                    calc();
//                    return null;
//                }
//            });
////            Thread thread = new Thread(new Runnable() {
////                @Override
////                public void run() {
////                    calc();
////                }
////            });
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end -start);
//    }
//
//    static void calc() {
//        int result = 0;
//        for (int i = 0; i < 10000; i++) {
//            for (int j = 0; j < 200; j++) {
//                result +=i;
//            }
//        }
//    }
//}
