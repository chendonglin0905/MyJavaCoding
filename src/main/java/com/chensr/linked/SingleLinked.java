package com.chensr.linked;

import com.chensr.List;
import com.chensr.Node;

import java.util.Iterator;

/**
 * <p> 单向链表
 * <b>创建日期：</b> 2019/3/9
 * </p>
 *
 * @author chendonglin@daojia-inc.com
 * @since 1.0.0-SNAPSHOT
 */
public class SingleLinked<T> implements List<T> {

    private SingleLinkedNode<T> head;

    private SingleLinkedNode<T> tail;

    private volatile int size;

    private SingleLinkedNode<T> next;

    public SingleLinked() {
        this.size = 0;
        this.tail = null;
        this.head = null;
    }

    public void add(Node<T> node) {
        if (node == null) {
            throw new RuntimeException("Node can't null");
        }
        if (!(node instanceof SingleLinkedNode)) {
            throw new RuntimeException("Must is singleLinkedNode");
        }
        SingleLinkedNode<T> singleLinkedNode = (SingleLinkedNode<T>) node;
        // if  is empty
        if (head == null) {
            head = singleLinkedNode;
            tail = singleLinkedNode;
        } else {
            tail.setNext(singleLinkedNode);
            tail = singleLinkedNode;
        }
        size++;
    }

    public Iterator<Node<T>> iterator() {
        return new Iterator<Node<T>>() {
            public boolean hasNext() {
                if (next == null) {
                    next = new SingleLinkedNodeImpl<T>(null);
                    next.setNext(head);
                }
                return next.next() != null;
            }

            public Node<T> next() {
                next = next.next();
                return next;
            }

            public void remove() {
            }
        };
    }
}
