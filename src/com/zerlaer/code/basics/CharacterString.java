package com.zerlaer.code.basics;

/**
 * @author Zerlaer
 * @date 2020/11/28 16:50
 * @name JavaLearn
 * @blog zerlaer.com
 */
public class CharacterString {
    public static void main(String[] args) {
        // 字符串前需要加上 String，字符串需要用双引号括起来
        String str = "Hello";
        // 使用substring()方法访问字符串中的一个子串,第一个参数为起点，第二个参数为终点，0-2就是访问第0,1个子串
        String s = str.substring(0,2);
        System.out.println(s);
        // 打印结果：He

        // 字符串拼接和Python一样使用'+'号
        String a = "Hello";

        String b = "World";
        int c = 100;
        String d = a.repeat(4);
        String e = a.substring(0, 3)  + "p";
        System.out.println(a+b);
        // 打印结果为：HelloWorld
        System.out.println(a + c);
        // 打印结果为：Hello100 当一个字符串和非字符串拼接时，后者会转换为字符串
        System.out.println(d);
        // 打印结果为：HelloHelloHelloHello,使用repeat方法让字符串重复多次
        System.out.println(e);
        // 打印结果为：Help ,将子串提取后和新的字符串拼接组成新的字符串
    }
}

