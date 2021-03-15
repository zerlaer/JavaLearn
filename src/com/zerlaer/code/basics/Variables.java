package com.zerlaer.code.basics;

/**
 * @author Zerlaer
 * @date 2020/11/28 16:47
 * @name JavaLearn
 * @blog zerlaer.com
 */
public class Variables {
    public static void main(String[] args) {
        //声明一个变量或常量时必须指定变量类型
        double price = 19.01;
        int number = 10;
        //使用final指示常量，常量名称全部大写
        final int AGE = 18;
        System.out.println(price);
        //19.01

        System.out.println(AGE);
        //18
        double x = 10;
        double y = Math.sqrt(x);
        double z = Math.sin(y / 10);
        double w = Math.PI;

        System.out.println(y);
        // 3.1622776601683795
        System.out.println(z);
        // 0.31098359290718575
        System.out.println(w);
        //3.141592653589793
        System.out.println((float) (w));
        //3.1415927
    }
}

