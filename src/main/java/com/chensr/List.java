package com.chensr;

public interface List<T> extends Iterable<Node<T>> {

    void add(Node<T> node);

}
