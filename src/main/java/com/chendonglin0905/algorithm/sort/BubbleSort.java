package com.chendonglin0905.algorithm.sort;

/**
 * <p> 冒泡排序算法
 * <b>创建日期：</b> 2019/9/5
 * </p>
 *
 * @author chendonglin
 * @since 1.0.0-SNAPSHOT
 */
public class BubbleSort extends AbstractSort {

    public BubbleSort(int[] array) {
        super(array);
    }

    @Override
    protected void sort(int[] array) {

        int j = array.length;
        for (int index = 0; index < array.length; index++) {
            for (int i = 1; i < j; i++) {
                if (array[i - 1] > array[i]) {
                    super.swap(array, i - 1, i);
                }
            }
            j--;
        }
    }
}
