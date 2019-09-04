package com.chendonglin0905;

import com.chendonglin0905.datastructure.linked.Node;
import com.chendonglin0905.datastructure.linked.SingleLinked;
import com.chendonglin0905.datastructure.linked.SingleLinkedNodeImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
        Iterator<Node<String>> iterator = linked.iterator();
        while (iterator.hasNext()) {
            Node node = iterator.next();
            System.out.println(node.getSource());
        }
    }

    @Test
    public void restRemove(){
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        list.add("test");
        list.add("test1");
        list.add("2");
        list.add("test3");
        Iterator<String> iterator = list.iterator();
        Map<String,String> flagMap = new HashMap<>();
        while (iterator.hasNext()){
            String str = iterator.next();
            if (flagMap.containsKey(str)) {
                iterator.remove();
            } else {
                flagMap.put(str, str);
            }
        }
        System.out.println(list.size());
    }

    @Test
    public void testString(){

        String test = "test";

        test.toUpperCase();


    }


}
