/*
 * @name MyinterfaceImpl
 * @date 2021/3/15 17:17
 * @author Zerlaer
 * @blog zerlaer.com
 */

package com.zerlaer.code.interfaces;

public class MyInterfaceImpl implements MyInterface {
  @Override
  public void methodOne() {
    System.out.println("接口定义的方法被重写了");
  }
}
