package com.algorithm.learning.sort;

import java.util.Arrays;

/**
 *@author qiaobao
 *@datetime  2018/9/21 4:38
 *@decribe 归并排序
 *
 * 字面上的意思，就是基于两个有序的数组合并的一种算法思想
 *
 * 我们先来探讨一下怎么实现两个有序数组的合并
 *
 * 首先我们会比较两个数组的最小值，A[0] > B[0]
 * 然后我们会A[0]一次去访问 B[i] 内的数据,
 * 直到 A[0] < B[j],然后将 B[0]....B[j],A[0]拷贝到新的数组，
 * 同时将比较对象变换成B[j],去比较A[1]之后的数据
 *
 */
public class MergerSort {
    /**
     * 合并两个有序的数组
     * @param args
     */
    public static void main(String[] args) {
        Integer[] a = new Integer[]{115, 118, 129, 144, 168};
        Integer[] b = new Integer[]{105, 106, 108, 116, 127};

        MergerSort mergerSort = new MergerSort();

        System.out.println(Arrays.toString(mergerSort.merge(a,b)));

        }

    public int[] merge(Integer[] a, Integer[] b) {

        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i <a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
            System.out.println("YIYIYIYIYIYIYIYI");
            System.out.println(Arrays.toString(c));
        }

        while (i < a.length) {
            c[k++] = a[i++];
            System.out.println("VIVIVIVIVIVIVIVI");
            System.out.println(Arrays.toString(c));
        }

        while (j < b.length) {
            c[k++] = b[j++];
            System.out.println("CICICICICICICIICICI");
            System.out.println(Arrays.toString(c));
        }

        return c;
    }


    }




