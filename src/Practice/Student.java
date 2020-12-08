/**
 * @author Zerlaer
 * @date 2020/12/1 17:18
 * @name StudentClass
 * @blog zerlaer.com
 */


package Practice;

// 创建一个学生类

public class Student {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


