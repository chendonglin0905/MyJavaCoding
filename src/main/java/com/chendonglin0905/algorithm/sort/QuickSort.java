package com.chendonglin0905.algorithm.sort;

/**
 * <p>快速排序算法
 * <b>创建日期：</b> 2019/9/5
 * </p>
 *
 * @author chendonglin
 * @since 1.0.0-SNAPSHOT
 */
public class QuickSort extends AbstractSort {

    public QuickSort(int[] array) {
        super(array);
    }

    @Override
    protected void sort(int[] array) {
        this.partition(array, 0, array.length - 1);
    }

    private void partition(int[] array, int head, int tail) {
        if (head == tail) {
            return;
        }

        int begin = head;
        int end = tail;

        int middleElement = array[head];
        int middleIndex = head;

        while (head != tail) {
            while (middleElement <= array[tail] && head != tail) {
                tail--;
            }
            super.swap(array, middleIndex, tail);
            middleIndex = tail;

            while (middleElement >= array[head] && head != tail) {
                head++;
            }
            super.swap(array, middleIndex, head);
            middleIndex = head;
        }

        this.partition(array, begin, middleIndex);
        this.partition(array, middleIndex + 1, end);
    }


}
