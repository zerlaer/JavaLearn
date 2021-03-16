/*
 * @author Zerlaer
 * @date 2021/3/15 11:43
 * @name BreakandContinue
 * @blog zerlaer.com
 */

package com.zerlaer.code.homework;

public class BreakandContinue {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      if (i == 74) break;
      if (i % 9 == 0) continue;
      System.out.print(i + " ");
    }
  }
}
