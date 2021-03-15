/*
 * @author Zerlaer
 * @date 2020/12/3 16:06
 * @name UseLocalDate
 * @blog zerlaer.com
 */


package com.zerlaer.code.basics;

import java.time.LocalDate;

public class UseLocalDate {
    public static void main(String[] args) {
        // 使用Java类库中的localDate
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate newYear = LocalDate.of(1992, 11, 14);
        System.out.println(newYear);
        System.out.println(newYear.getYear());
        System.out.println(newYear.getMonthValue());
        System.out.println(newYear.getDayOfMonth());

    }
}
