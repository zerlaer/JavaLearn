package Basic;

import java.util.Scanner;
/**
 * @author Zerlaer
 * @date 2020/11/28 16:51
 * @name JavaLearn
 * @blog zerlaer.com
 */


public class Judgment {

    public static void main(String[] args) {
        // 使用if else判断
        System.out.println("请输入你的年龄：");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("你的年龄为：" + age);
        if (age >= 18) {
            System.out.println("你已经成年了！你的年龄为：" + age);
        }
        if(age<25){
            System.out.println("你还是挺年轻的");
        }
        else {
            System.out.println("你已经快30岁了");
        }

        if (age < 18) {
            System.out.println("你是未成年! 你的年龄为：" + age);
        }


    }

}
/*
 * 请输入你的年龄： 26 你的年龄为：26 你已经成年了！你的年龄为：26 你已经快30岁了
 */
/*
 * 请输入你的年龄： 24 你的年龄为：24 你已经成年了！你的年龄为：24 你还是挺年轻的
 */

