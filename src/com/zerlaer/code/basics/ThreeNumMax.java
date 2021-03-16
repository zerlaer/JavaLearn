/*
 * @author Zerlaer
 * @date 2020/12/7 14:01
 * @name ThreeNumMax
 * @blog zerlaer.com
 */
package com.zerlaer.code.basics;

import java.util.Scanner;

/**
 * The type Three num max.
 */
public class ThreeNumMax {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int a, b, c;
        System.out.println("请输入一个数字:");
        a = sc.nextInt();
        System.out.println("请输入一个数字:");
        b = sc.nextInt();
        System.out.println("请输入一个数字:");
        c = sc.nextInt();
        int temp = Math.max(a, b);
        int max = Math.max(temp, c);
        System.out.println("最大的数为:" + max);

    }
}
