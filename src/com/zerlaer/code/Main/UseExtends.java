/*
 * @author Zerlaer
 * @date 2020/12/14 16:46
 * @name UseExtends
 * @blog zerlaer.com
 */
package com.zerlaer.code.Main;

import com.zerlaer.code.Class.Daughter;
import com.zerlaer.code.Class.Son;

//  定义一个父类
public class UseExtends {
    public static void main(String[] args) {
        Son son = new Son();
        son.method();
        Daughter daughter = new Daughter();
        daughter.method();
    }
}
