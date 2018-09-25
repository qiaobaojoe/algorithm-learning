package com.algorithm.learning.sort;

import java.util.Arrays;
import java.util.Random;

public class Action {
    public static void main(String[] args) {
//        班里有多少人
        Integer students[] = new Integer[5];
//        Integer students[] = new Integer[]{115, 100, 147, 136, 152};

        Random random = new Random();
        for (int i = 0; i <students.length ; i++) {
//           随机的插入120-160间的身高
            students[i] =random.nextInt(80) + 100  ;
        }
        System.out.println("==================初始化的数组==============");
        System.out.println(Arrays.toString(students));


//        Integer sortStudents[] = BubbleSort.sort(students);
//        Integer sortStudents[] = SelectSort.sort(students);
        Integer sortStudents[] = InsertSort.sort(students);

        System.out.println("==================排序后的数组==============");
        System.out.println(Arrays.toString(sortStudents));
    }

}
