package com.algorithm.learning.iteratitor;

import java.util.*;

public class IteratitorDemo{

    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i <10 ; i++) {
            list.add("小明" + i);
        }

        list.stream().forEach(s -> System.out.println(s));

        for ( Object a : list) {
            System.out.println(a);
        }

        for (Iterator<String> iterator = list.iterator();iterator.hasNext();) {
            System.out.println(iterator.next());
        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        Map map = new HashMap();
        for (int i = 0; i < 5; i++) {
            map.put(i, "小李" + i);
        }



    }
}
