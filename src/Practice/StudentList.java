/**
 * @author Zerlaer
 * @date 2020/12/8 16:25
 * @name StudentList
 * @blog zerlaer.com
 */

// 自定义4个学生对象，添加到集合，并遍历集合
package Practice;

import java.util.ArrayList;

public class StudentList {

  public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();
    // 创建4个学生对象
    Student one = new Student("韩梅梅", 18);
    Student two = new Student("李雷", 19);
    Student three = new Student("王伟", 18);
    Student four = new Student("张红", 17);
    list.add(one);
    list.add(two);
    list.add(three);
    list.add(four);
    for (int i = 0; i < list.size(); i++) {
      //获取4个学生对象
      Student stu = list.get(i);
      //获取4个学生对象的属性
      System.out.println("name:" + stu.getName() + "\nAge:" + stu.getAge());
    }
  }
}
