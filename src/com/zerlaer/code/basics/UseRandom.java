/*
 * @author Zerlaer
 * @date 2020/12/7 14:55
 * @name UseRandom
 * @blog zerlaer.com
 */


package com.zerlaer.code.basics;

import java.util.Random;

public class UseRandom {
    public static void main(String[] args) {
        // 创建一个随机数对象
        Random r = new Random();
        // 获取一个int范围内的随机数
        int num = r.nextInt();
        System.out.println(num);
        // 获取一个0-99范围内的随机数
        int newnum = r.nextInt(100);
        System.out.println(newnum);
        // 获取100个随机数，范围是1到n
        int n = 100;
        for (int i = 0; i < 100; i++) {
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }

    }
}
