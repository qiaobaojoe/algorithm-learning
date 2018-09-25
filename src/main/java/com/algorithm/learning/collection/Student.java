package com.algorithm.learning.collection;

public class Student implements Comparable<Student> {

    private String name;

    private Integer age;

    private Integer order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", order=" + order +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.getOrder().compareTo(student.getOrder());
    }

}
