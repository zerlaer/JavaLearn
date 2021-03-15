/*
 * @author Zerlaer
 * @date 2020/12/8 16:00
 * @name ForRandom
 * @blog zerlaer.com
 */
package com.zerlaer.code.basics;

import java.util.ArrayList;
import java.util.Random;

/*
 * The type For random.
 */
// 生成6个1-33之间的随机整数，添加到集合，并遍历集合
public class ForRandom {
    /*
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Random r = new Random();
            int num = r.nextInt(33) + 1;
            list.add(num);
            System.out.println(num);
        }

        System.out.println(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
