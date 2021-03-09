/*
 * @author Zerlaer
 * @date 2020/12/14 14:51
 * @name UseArrays
 * @blog zerlaer.com
 */

// 请使用Arrays将一个随机字符串的所有字符升序排列，并倒序打印
package com.zerlaer.code.List;

import java.util.Arrays;

/**
 * The type Use arrays.
 */
public class UseArrays {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String str = "3y9yjkh38u3ghqtdjfbdsu46i3b";
        //使用Arrays将字符串变成
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
