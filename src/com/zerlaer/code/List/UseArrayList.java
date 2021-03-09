/*
 * @author Zerlaer
 * @date 2020/12/7 15:50
 * @name UseArrayList
 * @blog zerlaer.com
 */
package com.zerlaer.code.List;

import java.util.ArrayList;

public class UseArrayList {
  public static void main(String[] args) {
    // 创建ArrayList对象
    ArrayList<String> list = new ArrayList<>();
    // 添加元素
    list.add("张三");
    list.add("李四");
    list.add("王五");
    list.add("赵六");
    System.out.println(list); // [张三, 李四, 王五, 赵六]
    // 在指定位置添加元素
    list.add(3, "李七"); // [张三, 李四, 王五, 李七, 赵六]
    System.out.println(list);
    // 获取指定位置的元素,索引值从0开始
    String name = list.get(2);
    System.out.println("第三号索引位置为：" + name); // 第三号索引位置为：王五
    // 获取集合长度
    int size = list.size();
    System.out.println("集合长度为：" + size); // 集合长度为：5
    // 根据元素值删除元素
    list.remove("张三");
    System.out.println(list); // [李四, 王五, 李七, 赵六]
    // 根据索引删除第一号元素
    list.remove(0);
    System.out.println(list); // [王五, 李七, 赵六]
    System.out.println(list.size());
    // ArrayList不能装普通数据类型，只能装引用类型，若要使用，需要使用包装类
    ArrayList<Integer> intlist = new ArrayList<>();
    ArrayList<Short> shortlist = new ArrayList<>();
    ArrayList<Long> longlist = new ArrayList<>();
    ArrayList<Byte> bytelist = new ArrayList<>();
    ArrayList<Float> floatlist = new ArrayList<>();
    ArrayList<Double> charlist = new ArrayList<>();
    ArrayList<Boolean> boollist = new ArrayList<>();
  }
}
