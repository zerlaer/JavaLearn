package com.zerlaer.code.Basic.DateType;

import java.math.BigInteger;

public class BigIntegers {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("999999999999999999999999999999999999999999");
        BigInteger b2 = new BigInteger("2");
        // 相加
        System.out.println(b1.add(b2));
        // 相减
        System.out.println(b1.subtract(b2));
        // 相乘
        System.out.println(b1.multiply(b2));
        // 相除取整
        System.out.println(b1.divide(b2));
        // 绝对值
        System.out.println(b1.abs());
        // 取反
        System.out.println(b1.negate());

    }
}
