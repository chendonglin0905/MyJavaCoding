package com.chendonglin0905.algorithm.sort;

/**
 * <p>选择排序
 * <b>创建日期：</b> 2019/9/4
 * </p>
 *
 * @author chendonglin
 * @since 1.0.0-SNAPSHOT
 */
public class SelectSort extends AbstractSort {

    public SelectSort(int[] array) {
        super(array);
    }

    /**
     * 确定最小值索引位置并和当前元素交换位置
     *
     * @param array 待排序数组
     */
    @Override
    protected void sort(int[] array) {
        int minIndex = 0;
        for (int index = 0; index < array.length; index++) {
            int tmp = array[index];
            int j = index + 1;
            // find min element index
            while (j < array.length) {
                if (tmp > array[j]) {
                    minIndex = j;
                    tmp = array[j];
                }
                j++;
            }
            // swap
            super.swap(array, index, minIndex);
        }

    }
}
