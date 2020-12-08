/**
 * @author Zerlaer
 * @date 2020/12/7 15:13
 * @name GuessNumber
 * @blog zerlaer.com
 */
package Practice;
/*猜数字游戏
描述:
1.生成一个0-100的随机数字并不再变化；
2.获取键盘输入的数字；
3.如果键盘输入数字和随机数相等，游戏结束，否则一值猜，直到猜对
*/

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
  public static void main(String[] args) {
    // 设置固定的随机数
    Random r = new Random();
    // 设置随机数的范围为0到100；
    final int randomNum = r.nextInt(101);
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("请输入您要猜的数字：");
      int guessNum = sc.nextInt();
      if (guessNum > randomNum) {
        System.out.println("太大了");
      } else if (guessNum < randomNum) {
        System.out.println("太小了");
      } else {
        System.out.println("恭喜你猜中了，数字为" + randomNum);
        break;
      }
    }
    System.out.println("游戏结束啦!");
  }
}
