package com.yuetsao.algo;

/**
 * @ClassName LRUBaseLinedList
 * @Description
 * @Author caoyue
 * @Date 2021/6/11 9:56 上
 * @Version V1.0
 **/
public class LRUBaseLinedList <T>{

     private static final int DEFAULT_CAPACITY = 10;

     private SNode<T> headNode;

     private Integer length;

     private Integer capacity;

     public LRUBaseLinedList () {
         this.headNode = new SNode<>();
         this.capacity = DEFAULT_CAPACITY;
         this.length = 0;
     }

    public LRUBaseLinedList(Integer capacity) {
        this.headNode = new SNode<>();
        this.capacity = capacity;
        this.length = 0;
    }

    public void add(T data) {
        SNode preNode = findPreNode(data);
        if(preNode != null) {
            deleteElemOptim(preNode);
            intsertElemAtBegin(data);
        }else {
            if (length >= this.capacity) {
                //删除尾结点
                deleteElemAtEnd();
            }
            intsertElemAtBegin(data);
        }
    }

    /**
     * 删除preNode结点下一个元素
     *
     * @param preNode
     */
    private void deleteElemOptim(SNode preNode) {
        SNode temp = preNode.getNext();
        preNode.setNext(temp.getNext());
        temp = null;
        length --;
    }

    /**
     * 链表头部插入节点
     *
     * @param data
     */
    private void intsertElemAtBegin(T data) {
        SNode next = headNode.getNext();
        headNode.setNext(new SNode(data, next));
        length ++;
    }

    /**
     * 获取查找到元素的前一个结点
     *
     * @param data
     * @return
     */
    private SNode findPreNode(T data) {
        SNode node = headNode;
        while (node.getNext() != null) {
            if(node.getNext().equals(data)) {
                return node.getNext();
            }
            node = node.getNext();
        }
        return null;
    }

    private void deleteElemAtEnd() {
        SNode ptr = headNode;
        // 空链表直接返回
        if (ptr.getNext() == null) {
            return;
        }

        // 倒数第二个结点
        while (ptr.getNext().getNext() != null) {
            ptr = ptr.getNext();
        }

        SNode tmp = ptr.getNext();
        ptr.setNext(null);
        tmp = null;
        length--;
    }

    private void printAll() {

    }





    public class SNode<T> {
        private T element;
        private SNode next;

        public SNode (){}

        public SNode (T element) {
            this.element = element;
        }

        public SNode (T element, SNode next) {
            this.element = element;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public SNode getNext() {
            return next;
        }

        public void setNext(SNode next) {
            this.next = next;
        }
    }
}
