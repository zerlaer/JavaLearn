package com.zerlaer.code.homework;
/*
 * @author Zerlaer
 * @date 2021/3/15 13:02
 * @name Dog
 * @blog zerlaer.com
 */
public class Dog {
  private String name;

  public Dog() {}

  public Dog(String name) {
    this.name = name;
  }

  public static void main(String[] args) {
    Dog.bark(1);
    Dog.bark("2");
  }

  private static void bark(String barking) {
    System.out.println("barking!");
  }

  private static void bark(int howling) {
    System.out.println("howling!");
  }
}
