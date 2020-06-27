package cn.itcast.day20.demo01;
/*
* 函数式接口的使用：一般可以作为方法的参数和返回值
* */
public class Demo {
    //定义一个方法，参数使用函数式接口MyFunctionalInterface
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        //1、调用show方法，方法的参数是一个接口，所以可以传递接口的实现类对象
        show(new MyFunctionalInterfaceImpl());

        //2、调用show方法，方法的参数是一个接口，所以可以传递接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部，重写接口中的抽象方法method");
            }
        });

        //3、调用show方法，方法的参数是一个函数式接口，所以可以传递Lambda表达式(使用Lambda表达式没有class文件的概念的，那么以后内存中就少加载了这么一个文件，从而Lambda表达式比匿名内部类的效率高)
        show(() -> {
            System.out.println("使用Lambda表达式重写接口中的抽象方法");
        });

        //4、简化Lambda表达式
        show(() -> System.out.println("使用简化Lambda表达式重写接口中的抽象方法"));
    }
}
