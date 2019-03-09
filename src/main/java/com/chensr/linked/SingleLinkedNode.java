package com.chensr.linked;

import com.chensr.Node;

/**
 * <p>
 * <b>创建日期：</b> 2019/3/9
 * </p>
 *
 * @author chendonglin@daojia-inc.com
 * @since 1.0.0-SNAPSHOT
 */
public interface SingleLinkedNode<T> extends Node<T> {

    SingleLinkedNode<T> next();

    void setNext(SingleLinkedNode<T> next);
}
