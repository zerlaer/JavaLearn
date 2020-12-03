package ClassObject;

/**
 * @author Zerlaer
 * @date 2020/12/3 13:12
 * @name UsePhone
 * @blog zerlaer.com
 */

// 使用手机类

public class UsePhone {
  public
  static void main(String[] args) {
    Phone iPhone = new Phone();
    iPhone.brand = "苹果";
    iPhone.color = "黑色";
    iPhone.model = "iPhone12";
    iPhone.price = 8848.48;

    System.out.println(
            "电脑品牌为:"
                    + iPhone.brand
                    + "\n"
                    + "电脑颜色为:"
                    + iPhone.color
                    + "\n"
                    + "电脑型号为:"
                    + iPhone.model
                    + "\n"
                    + "电脑价格为:"
                    + iPhone.price
    );
    iPhone.call("乔布斯");
    iPhone.sendMessage("库克");

     /* 电脑品牌为:苹果
        电脑颜色为:黑色
        电脑型号为:iPhone12
        电脑价格为:8848.48
        给乔布斯打电话!
        给库克发短信!
     */
  }
}
