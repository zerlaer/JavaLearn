package com.zerlaer.code.basics;

import static java.lang.System.out;

/**
 * @author Zerlaer
 * @date 2020/11/28 16:44
 * @name JavaLearn
 * @blog zerlaer.com
 */

// 数据类型
public class DataType {
  public static void main(String[] args) {
    final int a = 2 * 1000000000;
    final long b = 2 * 1000000000;
    final double d = 0x1.0p-3 * 0.01;

    out.println(a * 200);
    out.println(b * 200);
    out.println(d);
    out.println(('\u03c0'));
    out.println(('\u2122'));
    out.println(false);
    out.println(true);
  }
}
