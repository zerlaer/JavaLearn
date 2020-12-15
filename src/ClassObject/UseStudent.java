/**
 * @author Zerlaer
 * @date 2020/12/9 16:00
 * @name UseStudent
 * @blog zerlaer.com
 */
package ClassObject;

public class UseStudent {
  public static void main(String[] args) {

    Student one = new Student("郭靖", 18, 1);
    Student two = new Student("黄蓉", 19, 2);
    Student three = new Student("杨康", 20, 3);
    Student.room = "教室1";
    System.out.println(
            "姓名："
                    + one.getName()
                    + "\n年龄："
                    + one.getAge()
                    + "\n学号:"
                    + one.getId()
                    + "\n教室："
                    + Student.room);
    System.out.println(
            "姓名："
                    + two.getName()
                    + "\n年龄："
                    + two.getAge()
                    + "\n学号:"
                    + two.getId()
                    + "\n教室："
                    + Student.room);
    System.out.println(
            "姓名："
                    + three.getName()
                    + "\n年龄："
                    + three.getAge()
                    + "\n学号:"
                    + three.getId()
                    + "\n教室："
                    + Student.room);
  }
}
