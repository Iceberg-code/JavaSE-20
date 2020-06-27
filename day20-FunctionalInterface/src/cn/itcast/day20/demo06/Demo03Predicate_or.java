package cn.itcast.day20.demo06;

import java.util.function.Predicate;

/*
* 需求：判断一个字符串，有两个判断条件
*       1、判断字符串的长度是否大于5
*       2、判断字符串中是否包含a
* 满足一个条件即可，我们就可以使用||运算符连接两个条件
*
* Predicate接口中有一个方法or，表示或者关系，也可以用于连接两个判断条件
* default Predicate<T> or(Predicate<? super T> other){
*       Object.requireNonNull(other);
*       return (t) -> this.test(t) || other.test(t);
* }
* 方法内部的两个判断条件，也是使用||运算符连接起来的
*/
public class Demo03Predicate_or {
    /*
     * 定义一个方法，方法的参数，传递一个字符串
     * 再传递2个Predicate接口
     *       一个判断字符串的长度是否大于5
     *       一个判断字符串中是否包含a
     * 满足一个条件即可
     * */
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2){
        //return pre1.test(s) || pre2.test(s);

        //用or方法对其进行改造"return pre1.test(s) || pre2.test(s);"语句进行改造。这两个语句等价
        return pre1.or(pre2).test(s);
    }

    public static void main(String[] args) {
        //定义一个字符串
        String str = "abcdef";

        //调用checkString方法，参数传递字符串，和2个Lambda表达式
        boolean b = checkString(str, (String s) -> {
            //判断字符串的长度是否大于5
            return s.length() > 5;
        }, (String s) -> {
            //判断字符串中是否包含a
            return s.contains("a");
        });
        System.out.println(b);
    }

}
