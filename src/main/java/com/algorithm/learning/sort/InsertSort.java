package com.algorithm.learning.sort;

import java.util.Arrays;

/**
 *@author qiaobao
 *@datetime  2018/9/20 19:48
 *@decribe 插入排序
 *
 * 顾名思义，插入排序的思想就是默认一张有序的数组中插入数据
 * 好比我们现在向已经排好顺序的队列中插入一个学生，我们会把他和排头的相比较，如果比排头高的话，就放在第一位，否则以此的向下比较
 */

public class InsertSort {

    public static Integer[] sort(Integer[] arr) {
//        容器
        int num ;
        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {

//            向有序的数组插入数据
            for (int j = i; j >= 0 ; j--) {
                if (arr[j + 1] < arr[j]) {
                    num = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = num;
                    System.out.println("数组交换位置" + Arrays.toString(arr));
                }else {
                    System.out.println("跳出循环");
                    break;
                }
            }
            System.out.println("==================当前有序数组长度"+(i+1)+"==================");
            System.out.println(Arrays.toString(arr));
        }

        return arr;
    }
}
