package com.chensr;

import com.chensr.linked.SingleLinked;
import com.chensr.linked.SingleLinkedNodeImpl;
import org.junit.Test;

import java.util.Iterator;

public class SingleLinkedTestTest {


    @Test
    public void testLinkedList() {
        Node<String> node_1 = new SingleLinkedNodeImpl<String>("ABC");
        Node<String> node_2 = new SingleLinkedNodeImpl<String>("DEF");
        Node<String> node_3 = new SingleLinkedNodeImpl<String>("FHI");
        Node<String> node_4 = new SingleLinkedNodeImpl<String>("JKU");
        Node<String> node_5 = new SingleLinkedNodeImpl<String>("VWZ");
        Node<String> node_6 = new SingleLinkedNodeImpl<String>("YKL");

        SingleLinked<String> linked = new SingleLinked<String>();
        linked.add(node_1);
        linked.add(node_2);
        linked.add(node_3);
        linked.add(node_4);
        linked.add(node_5);
        linked.add(node_6);
        Iterator iterator = linked.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
