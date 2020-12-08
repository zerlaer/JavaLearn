/**
 * @author Zerlaer
 * @date 2020/12/7 13:42
 * @name UseScaner
 * @blog zerlaer.com
 */


package ClassObject;

import java.util.Scanner;

public class UseScaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 获取数字
        System.out.println("请输入的数字：");
        int num = scanner.nextInt();
        System.out.println("输入的数字为" + num);
        // 获取字符串
        System.out.println("请输入的任意字符：");
        String str = scanner.next();
        System.out.println("输入的字符串为：" + str);
    }
}
