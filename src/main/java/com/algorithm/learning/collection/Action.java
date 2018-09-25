package com.algorithm.learning.collection;

import java.util.*;

public class Action {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("xiaoming");
        student1.setAge(10);
        student1.setOrder(3);

        Student student2 = new Student();
        student2.setName("zhang");
        student2.setAge(10);
        student2.setOrder(1);

        List<Student> list = new ArrayList();
        list.add(student1);
        list.add(student2);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        for (Student s :list) {
            System.out.println(s);
        }

        Iterator iterator = list.iterator();


        List<Person> personList = new ArrayList<>();
        Person p1 = new Person();
        p1.setName("jjjjj");
        p1.setAge(11);

        Person p2 = new Person();
        p2.setName("lllllll");
        p2.setAge(19);

        personList.add(p2);
        personList.add(p1);

        System.out.println(personList);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        System.out.println(personList);
    }
}
