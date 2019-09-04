package com.chendonglin0905.algorithm.sort;

/**
 * <p>
 * <b>创建日期：</b> 2019/9/4
 * </p>
 *
 * @author chendonglin
 * @since 1.0.0-SNAPSHOT
 */
public abstract class AbstractSort {

    private int[] array;

    public AbstractSort(int[] array) {
        this.array = array;
    }


    protected abstract void sort(int[] array);


    public void sort() {
        sort(this.array);
        System.out.println("Console out!!!!");
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println("Console ending!!!!");
    }
}
