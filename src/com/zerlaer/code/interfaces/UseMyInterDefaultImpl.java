/*
 * @name UseMyInterDefaultImpl
 * @date 2021/3/15 17:40
 * @author Zerlaer
 * @blog zerlaer.com
 */

package com.zerlaer.code.interfaces;

public class UseMyInterDefaultImpl {
  public static void main(String[] args) {

    MyInterDefaultImplOne one = new MyInterDefaultImplOne();
    MyInterDefaultImplTwo two = new MyInterDefaultImplTwo();

    one.methodTwo();
    one.methodOne();

    two.methodOne();
    two.methodTwo();
  }
}
