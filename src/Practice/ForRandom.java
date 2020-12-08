/**
 * @author Zerlaer
 * @date 2020/12/8 16:00
 * @name ForRandom
 * @blog zerlaer.com
 */
package Practice;

import java.util.ArrayList;
import java.util.Random;

// 生成6个1-33之间的随机整数，添加到集合，并遍历集合
public class ForRandom {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < 6; i++) {
      Random r = new Random();
      int num = r.nextInt(33) + 1;
      list.add(num);
      System.out.println(num);
    }

    System.out.println(list);

    for (int j = 0; j < list.size(); j++) {
      System.out.println(list.get(j));
    }
  }
}
