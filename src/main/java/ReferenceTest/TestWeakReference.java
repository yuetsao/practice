package ReferenceTest;

import java.lang.ref.WeakReference;

/**
 * @author caoyue
 * @description 弱引用的实例
 * @date 2019-06-20 14:36
 **/
public class TestWeakReference {
    public static void main(String[] args) {
        WeakReference weakReference = new WeakReference(new Object());
        System.out.println("触发gc之前" + weakReference.get());
        System.gc();
        System.out.println("手动触发gc"+ weakReference.get());
    }
}
