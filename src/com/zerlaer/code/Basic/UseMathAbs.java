/*
 * @author Zerlaer
 * @date 2020/12/9 17:04
 * @name UseMathAbs
 * @blog zerlaer.com
 */

// 计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个；
package com.zerlaer.code.Basic;

/**
 * The type Use math abs.
 */
public class UseMathAbs {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        for (int i = (int) min; i < max; i++) {
            int abs = Math.abs(i);
            if (abs > 6 || abs < 2.1) {
                System.out.println(abs);
                count++;
            }

        }
        System.out.println("符合要求的有：" + count + "个");
    }
}
