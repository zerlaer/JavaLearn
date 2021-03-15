/*
 * @author Zerlaer
 * @date 2020/12/8 11:37
 * @name StringFormat
 * @blog zerlaer.com
 */


package com.zerlaer.code.basics;

import java.util.Date;

/**
 * The type String format.
 */
public class StringFormat {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        double x = 1000.00 / 3.0;
        System.out.println(x);
        System.out.printf("%.3f", x);
        System.out.println();
        System.out.printf("%s %tY-%<tm-%<td", "", new Date());
    }
}
