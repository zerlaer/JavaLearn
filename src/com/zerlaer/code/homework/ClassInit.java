/*
 * @author Zerlaer
 * @date 2021/3/15 12:34
 * @name ClassInit
 * @blog zerlaer.com
 */

package com.zerlaer.code.homework;

public class ClassInit {
  private int num;
  private String name;
  private float flo;

  private ClassInit() {
    System.out.println("num = " + num);
    System.out.println("name = " + name);
    System.out.println("flo = " + flo);
  }

  private ClassInit(String name) {
    this.name = name;

    System.out.println("name = " + name);
  }

  public static void main(String[] args) {
    ClassInit classInit = new ClassInit("zhangsan");
  }
}
