package Basic;

/**
 * @author Zerlaer
 * @date 2020/11/28 16:40
 * @name JavaLearn
 * @blog zerlaer.com
 */

 /*
1.public 称为访问修饰符（access modifier）,用于其他部分访问这段代码；
2.class 代表这个程序内容全部在一个类中，class后紧跟类名，名称必须以字母开头，后面跟字母或数字，
  但不能使用Java保留字，尽量使用驼峰命名法命名；
3.源代码名称必须和类名一致，以.java作为扩展名
4.Java虚拟机从main方法开始执行代码，每个类的源文件里必须包含一个main的方法
5.用{}划分程序的每个部分，Java中的任何方法都是以'{'开头，用'}'结尾
代码格式：
    public class ClassName
    {
        public static void main(String[] args)
        {
            program
        }
    }

    */
//第一个程序

public class FirstSample {

    public static void main(String[] args) {
        //打印字符串
        System.out.println("Hello Java!");

        System.out.println("hello java");
    }

}
/*
Hello Java!
hello java
*/

