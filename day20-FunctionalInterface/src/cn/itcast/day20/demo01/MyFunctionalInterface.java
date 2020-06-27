package cn.itcast.day20.demo01;
/*
* 函数式接口：有且只有一个抽象方法的接口，称之为函数式接口
* 当然接口中可以包含其他的方法(默认、静态、私有)
*
* @FunctionalInterface 注解的作用：
*       可以检测接口是否是一个函数式接口
*           是：编译成功
*           否：编译失败(接口中没有抽象方法/抽象方法的个数多于1个)
* */
@FunctionalInterface    //函数式接口注解
public interface MyFunctionalInterface {
    //定义一个抽象方法
    public abstract void method();

    //只能有一个抽象方法，不能有多个。  同时也不能没有抽象方法
    //void method2();
}
