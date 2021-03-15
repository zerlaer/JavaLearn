/*
 * @author Zerlaer
 * @date 2020/12/3 11:44
 * @name Phone
 * @blog zerlaer.com
 */
package com.zerlaer.code.classes;
//定义一个手机类

public class Phone {
  // 设置手机颜色、品牌、型号、和价格成员变量

  String brand;
  String color;
  String model;
  double price;


  // 设置成员方法

  public String call(String who) {
    System.out.println("给" + who + "打电话!");
    return who;
  }

  public String sendMessage(String who) {
    System.out.println("给" + who + "发短信!");
    return who;
  }

}
