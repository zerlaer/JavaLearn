/**
 * @author Zerlaer
 * @date 2020/12/3 11:34
 * @name UseStudent
 * @blog zerlaer.com
 */
package ClassObject;
// 使用学生类

public class UseStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setAge(18);
        stu.name = "Kelvin";
        System.out.println(stu.name);
        System.out.println(stu.getAge());
    }
}
