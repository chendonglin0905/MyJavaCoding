package com.chendonglin0905.datastructure.linked;

/**
 * <p>
 * <b>创建日期：</b> 2019/3/9
 * </p>
 *
 * @author
 * @since 1.0.0-SNAPSHOT
 */
public class SingleLinkedNodeImpl<T> implements SingleLinkedNode<T> {

    private SingleLinkedNode<T> next;

    private T t;

    public SingleLinkedNodeImpl(T t) {
        this.t = t;
    }

    public SingleLinkedNode<T> next() {
        return next;
    }

    public T getSource() {
        return t;
    }

    public Class getSourceClass() {
        return t.getClass();
    }

    public boolean isNull() {
        return t == null;
    }

    public void setNext(SingleLinkedNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return t.toString();
    }
}
