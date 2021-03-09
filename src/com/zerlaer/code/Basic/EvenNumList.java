/*
 * @author Zerlaer
 * @date 2020/12/8 17:37
 * @name EvenNumList
 * @blog zerlaer.com
 */

// 用一个大集合存入100个0-100的随机数字，然后筛选出其中的偶数元素,装入新的集合
package com.zerlaer.code.Basic;

import java.util.ArrayList;
import java.util.Random;

/**
 * The type Even num list.
 */
public class EvenNumList {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // 创建大集合对象
        ArrayList<Integer> L = new ArrayList<>();
        // 创建大集合对象
        ArrayList<Integer> l = new ArrayList<>();
        // 创建随机数对象
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(101);
            L.add(num);
            if (num % 2==0) {
                l.add(num);
            }
        }
        System.out.println("生成的100个随机数为:\n" + L + "\n集合元素个数为:" + L.size());
        System.out.println("生成的小集合为:\n" + l + "\n集合元素个数为:" + l.size());
    }
}
