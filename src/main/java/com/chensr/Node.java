package com.chensr;

/**
 * <p>
 * <b>创建日期：</b> 2019/3/9
 * </p>
 *
 * @author
 * @since 1.0.0-SNAPSHOT
 */
public interface Node<T> {

    T getSource();

    Class getSourceClass();

    boolean isNull();
}
