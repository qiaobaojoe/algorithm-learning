package com.algorithm.learning.sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

/**
 *@author qiaobao
 *@datetime  2018/9/20 3:40
 *@decribe 冒泡排序的实现
 *
 * 冒泡的排序的思想：
 * 比如目前班里面的人要按照身高来排队列，我们怎么去实现，结合平常生活中的经验我们马上有了思路：
 * 我们让最高的人站在右边，然后依次的排下来，怎么去选出最高的人呢？
 * 从开始的第一个人和右边的人比，如果比右边的高那么他们两个调换位置。如果不是则位置不变，比较完后，最左边的继续执行操作，选出第二高的人，依次下来
 * 下面就来看看，用我们的java代码怎么实现
 */

public class BubbleSort {

    public static void main(String[] args) {
//        班里有多少人
//        Integer students[] = new Integer[5];
        Integer students[] = new Integer[]{1,2,3,4,5};

        Random random = new Random();
        for (int i = 0; i <students.length ; i++) {
////            随机的插入120-160间的身高
            students[i] =random.nextInt(40) + 120  ;
        }
        System.out.println("==================初始化的数组==============");
        System.out.println(Arrays.toString(students));

        BubbleSort bubbleSort = new BubbleSort();
        Integer sortStudents[] = bubbleSort.sort(students);

        System.out.println("==================排序后的数组==============");
        System.out.println(Arrays.toString(sortStudents));
    }


    public Integer[] sort(Integer[] students) {


//        一共需要几次人员移动?
//        在双方调换位置的时候需要一个容器
        int num;
//      进行最高位置排序的次数
        int times = students.length-1;

//      数组是否已经完成排序的状态判断
        int sortResult = 0;

        for (int i = 0; i <times ; i++) {
            //        找出最高的人,人员所需要挪动的次数
            int now = times-i;

            for (int j = 0; j <now; j++) {
//                每进入一次唯一循环时，初始赋值0
                sortResult = 0 ;
//            比较当前对象比右边对象大，则两者调换位置
                while (students[j]>students[j+1]){
                    num = students[j];
                    students[j] = students[j + 1];
                    students[j + 1]= num;
//                    进行位移的话，计数
                    sortResult++;
                }
                System.out.println("人员移动"+Arrays.toString(students));
            }

            System.out.println("==================第"+(i+1)+"次排序后==============");
            //打印数组的几种方式
            System.out.println(Arrays.toString(students));


            if (sortResult == 0) {
                System.out.println("排序完成");
                break;
            }

        }

        return students;
    }




}
