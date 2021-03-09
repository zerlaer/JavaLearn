/*
 * @author Zerlaer
 * @date 2020/12/1 17:18
 * @name StudentClass
 * @blog zerlaer.com
 */


package com.zerlaer.code.Class;

// 创建一个学生类

/**
 * The type Student.
 */
public class Student {

    private String name;
    private int age;

    /**
     * Instantiates a new Student.
     */
    public Student() {
    }

    /**
     * Instantiates a new Student.
     *
     * @param name the name
     * @param age  the age
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }
}


