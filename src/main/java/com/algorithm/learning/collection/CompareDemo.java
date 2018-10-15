package com.algorithm.learning.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CompareDemo {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap();

        map.put("name", "qiaobao");
        map.put("age", "11");
        map.put("phone", "13275869228");

        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Map.Entry<String,String> a :map.entrySet()) {
            System.out.println(a);
        }

        for (String key: map.keySet()) {
            System.out.println(key);

        }

        for (String value : map.values()
                ) {
            System.out.println(value);
        }

        map.forEach((k, v) -> {
            System.out.println("java 8 的新特性  stream 函数");
            System.out.println(k + "=" + v);
        });

        Object







    }
}
