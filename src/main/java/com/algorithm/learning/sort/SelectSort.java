package com.algorithm.learning.sort;

import java.util.Arrays;

/**
 *@author qiaobao
 *@datetime  2018/9/20 19:49
 *@decribe 选择排序
 *
 * 选择排序的思想：
 * 现在还是给班里的同学从左往右的排身高：
 * 我们现在从左边开始第一个同学，让这个同学站出来和右边的同学依次比较身高，
 * 若右边的同学比他矮，那么他就站到这个同学的位置上，那个矮一点的同学站出来和其他的同学比较。从左到右依次的把各个位置上最矮的人选出来
 *
 * ”选择"，就是把每个位置上符合要求到筛选出来
 */

public class SelectSort {


    public static Integer[] sort(Integer[] arr){
//    用来存放数组中的最小值
        int min ;
//        数组最小值的标记
        int index;

        for (int i = 0; i <arr.length ; i++) {
            //            进入循环比较，将最小值赋值为数组的第一个数据
            min = arr[i];
            index = i;
            //        选出最矮的人
            for (int j = i+1; j <arr.length ; j++) {
                while (arr[j] < min) {
//                    循环比较的数组的最小值，添加标记
                    min = arr[j];
                    index = j;
                }
            }
            if (index != i) {
                arr[index] = arr[i];
                arr[i] = min;
                System.out.println("数组交换位置"+Arrays.toString(arr));
            }

            System.out.println("==================数组的左边第"+i+"值已经确定==================");
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
