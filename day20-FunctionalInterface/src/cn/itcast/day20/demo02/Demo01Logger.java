package cn.itcast.day20.demo02;
/*
* 日志案例
*
* 发现以下代码存在一些性能浪费问题
* 调用shoeLog方法时，传递的第二个参数是一个拼接后的字符串
* 先把字符串拼接好，然后再调用showLog方法
* showLog方法中如果传递的日志等级不是1级
* 那么就不会输出拼接后的字符串
* 所以就感觉字符串白拼接了，所以存在了性能浪费
* */
public class Demo01Logger {
    //定义一个根据日志的级别，显示日志信息的方法
    public static void showLog(int level, String message){
        //对日志的等级进行判断，如果是1级别，那么输出日志信息
        if(level == 1){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        //调用showLog方法，传递日志级别和日志信息
        showLog(1, msg1 + msg2 + msg3);
    }

}
