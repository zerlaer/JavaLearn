/*
 * @author Zerlaer
 * @date 2020/12/14 16:46
 * @name UseExtends
 * @blog zerlaer.com
 */
package com.zerlaer.code.mains;

import com.zerlaer.code.classes.Daughter;
import com.zerlaer.code.classes.Son;

/** @author z3samx */
public class UseExtends {
  public static void main(String[] args) {
    Son son = new Son();
    son.method();
    Daughter daughter = new Daughter();
    daughter.method();
  }
}
