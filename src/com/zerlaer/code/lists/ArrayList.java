package com.zerlaer.code.lists;

/**
 * @author Zerlaer
 * @date 2020/12/1 14:30
 * @name com.zerlaer.ClassObject.Basic.ArrayList
 * @blog zerlaer.com
 */
public class ArrayList {
    public static void main(String[] args) {
        // 获取数组长度
        int[] arrayA = {100, 203, 35, 54, 95, 16, 7, 16};
        int[] arrayB = {100, 203, 35, 54, 95, -16, -7, 16};
        System.out.println("数组长度" + arrayA.length);
        // 遍历数组
        int i = 0;
        while (i < arrayA.length) {
            System.out.println(arrayA[i]);
            i++;
        }
        // 求最大值
        int max = arrayA[0];
        for (int value : arrayA) {
            if (value > max) {
                // 谁最大谁就赋给max
                max = value;
            }
        }

        System.out.println("最大的数为：" + max);

        // 求最小值
        int min = arrayB[0];
        for (int k = 0; k < arrayA.length; k++) {
            if (arrayB[k] < min) {
                // 谁最小谁就赋给min
                min = arrayB[k];
            }
        }
        System.out.println("最小的数为：" + min);
        // 数组翻转

    }
}
