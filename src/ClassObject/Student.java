/**
 * @author Zerlaer
 * @date 2020/12/1 17:18
 * @name StudentClass
 * @blog zerlaer.com
 */


package ClassObject;
// 创建一个学生类

public class Student {
    // 成员变量定义在=类当中，方法之外

    String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int num) {
        if (num >= 0) {
            age = num;
        } else {
            System.out.println("age数据输入错误!");
        }
    }
}
