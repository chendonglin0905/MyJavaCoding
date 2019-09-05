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

    /**
     * 排序
     *
     * @param array 待排序数组
     */
    protected abstract void sort(int[] array);

    /**
     * 排序启动入口
     */
    public void execSort() {
        sort(this.array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    /**
     * 不用临时变量交换两个int 变量
     *
     * @param array 数组
     * @param i     索引i
     * @param j     索引j
     */
    protected void swap(int[] array, int i, int j) {
        int sum = array[i] + array[j];
        array[i] = sum - array[i];
        array[j] = sum - array[j];
    }
}
