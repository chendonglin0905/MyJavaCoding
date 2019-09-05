package com.chendonglin0905.algorithm.sort;

import org.junit.Test;

/**
 * <p>
 * <b>创建日期：</b> 2019/9/4
 * </p>
 *
 * @author chendonglin
 * @since 1.0.0-SNAPSHOT
 */
public class SortTest {


    private static final int[] TEST_ARR = new int[]{0, 3, 1, 2, 9, 8, 7, 5, 2};

    @Test
    public void testInsertSort() {
        AbstractSort sort = new InsertSort(TEST_ARR);
        sort.execSort();
    }

    @Test
    public void testSelectSort() {
        AbstractSort sort = new SelectSort(TEST_ARR);
        sort.execSort();
    }

    @Test
    public void testBubbleSort() {
        AbstractSort sort = new BubbleSort(TEST_ARR);
        sort.execSort();
    }

    @Test
    public void testQuickSort() {
        AbstractSort sort = new QuickSort(TEST_ARR);
        sort.execSort();
    }

}
