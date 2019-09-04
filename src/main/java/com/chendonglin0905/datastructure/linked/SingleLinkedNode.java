package com.chendonglin0905.datastructure.linked;

/**
 * <p>
 * <b>创建日期：</b> 2019/3/9
 * </p>
 *
 * @author
 * @since 1.0.0-SNAPSHOT
 */
public interface SingleLinkedNode<T> extends Node<T> {

    SingleLinkedNode<T> next();

    void setNext(SingleLinkedNode<T> next);
}
