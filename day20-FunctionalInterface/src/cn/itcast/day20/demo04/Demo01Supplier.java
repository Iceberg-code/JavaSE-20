package cn.itcast.day20.demo04;

import java.util.function.Supplier;

/*
* 常用的函数式接口
* java.util.function.Supplier<T> 接口仅包含一个无参的方法：T get()。用来获取一个泛型参数指定类型的对象数据
*
* Supplier<T>接口被称之为生产型接口，指定接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据
* */
public class Demo01Supplier {
    //定义一个方法，方法的参数传递Supplier<T>接口，泛型指定为String类型，所以get方法就会返回一个String
    public static String getString(Supplier<String> sup){
        return sup.get();   //get方法就会生产String类型的数据
    }

    public static void main(String[] args) {
        //调用getString方法，方法的参数Supplier是一个函数式接口，所以可以传递Lambda表达式
        String s = getString(() -> {
            //生产一个字符串，并返回
            return "奥丽莎";
        });
        System.out.println(s);

        //调用getString方法，方法的参数Supplier是一个函数式接口，所以可以传递Lambda表达式
        //对Lambda表达式进行优化
        String s2 = getString(() -> "麦克雷");
        System.out.println(s2);
    }
}
