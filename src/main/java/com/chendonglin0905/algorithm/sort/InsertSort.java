package com.chendonglin0905.algorithm.sort;

/**
 * <p>
 * 插入排序
 * <b>创建日期：</b> 2019/9/4
 * </p>
 *
 * @author chendonglin
 * @since 1.0.0-SNAPSHOT
 */
public class InsertSort extends AbstractSort {

    public InsertSort(int[] array) {
        super(array);
    }

    /**
     * 1、确定起始位置，2、找位置，3、插入数据
     *
     * @param array
     */
    @Override
    protected void sort(int[] array) {
        // 确定起始位置为1
        for (int index = 1; index < array.length; index++) {
            // 当前数据
            int that = array[index];
            //
//            for (int i = index - 1; i >= 0; i--) {
//                if (that < array[i]) {
//                    array[i + 1] = array[i];
//                } else {
//                    array[i+1] = that;
//                    break;
//                }
//            }
            // 找位置，主要是元素搬移
            int j = index-1;
            while (that < array[j] && j > 0) {
                array[j+1] = array[j];
                j--;
            }
            // 插入
            array[j+1] = that;
        }
    }
}
